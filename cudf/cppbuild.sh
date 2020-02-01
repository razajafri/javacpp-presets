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

CUDF_DEV=~/miniconda2/envs/cudf_dev

case $PLATFORM in
    linux-x86_64)
        if [[ ! -d $INSTALL_PATH/lib ]]; then
            cp -r $CUDF_DEV/* .
        fi
        ;;
    *)
        echo -e "[${RED}ERROR${NC}] Platform \"$PLATFORM\" is not supported"
        ;;
esac
