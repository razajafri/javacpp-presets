#!/bin/bash -e
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" cuda
    popd
    exit
fi

RED='\033[1;31m'
NC='\033[0m' # No Color

LIBCUSPATIAL_VERSION=0.12.0a191213

case $PLATFORM in
    linux-x86_64)
        if [[ ! -d "/usr/local/cuspatial/" ]]; then
            echo -e "[${RED}ERROR${NC}] Please install cuspatial in /usr/local/cuspatial"
            echo -e "[${RED}ERROR${NC}] For example:"
            echo -e "[${RED}ERROR${NC}] sudo /bin/bash -c 'conda create -y -p /usr/local/cuspatial-$LIBCUSPATIAL_VERSION -c conda-forge -c rapidsai-nightly libcuspatial=$LIBCUSPATIAL_VERSION && ln -s /usr/local/cuspatial-$LIBCUSPATIAL_VERSION /usr/local/cuspatial && echo '/usr/local/cuspatial-$LIBCUSPATIAL_VERSION/lib' > /etc/ld.so.conf.d/cuspatial-$LIBCUSPATIAL_VERSION.conf && sudo ldconfig'"
            exit 1
        fi
        ;;
    *)
        echo -e "[${RED}ERROR${NC}] Platform \"$PLATFORM\" is not supported"
        ;;
esac
