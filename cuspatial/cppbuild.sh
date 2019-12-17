#!/bin/bash -e
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" cuspatial
    popd
    exit
fi

mkdir -p $PLATFORM
cd $PLATFORM
INSTALL_PATH=`pwd`

RED='\033[1;31m'
NC='\033[0m' # No Color

CUSPATIAL_VERSION=0.12.0a191213

case $PLATFORM in
    linux-x86_64)
        if [[ ! -d $INSTALL_PATH/lib ]]; then
            conda create -y -p $INSTALL_PATH -c conda-forge -c rapidsai-nightly/linux-64 cuspatial=$CUSPATIAL_VERSION libgcc
            conda clean -y --all
        fi
        ;;
    *)
        echo -e "[${RED}ERROR${NC}] Platform \"$PLATFORM\" is not supported"
        ;;
esac
