#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" cuda
    popd
    exit
fi

LIBCUSPATIAL_VERSION=0.12.0a191213

case $PLATFORM in
    linux-x86_64)
        if [[ ! -d "/usr/local/cuspatial-$LIBCUSPATIAL_VERSION/" ]]; then
            echo "Please install LIBCUSPATIAL in /usr/local/libcuspatial-$LIBCUSPATIAL_VERSION"
            echo "for example:"
            echo "    sudo conda create -y -p /usr/local/libcuspatial-$LIBCUSPATIAL_VERSION -c conda-forge -c rapidsai-nightly libcuspatial=$LIBCUSPATIAL_VERSION"
            echo "    sudo cat '/usr/local/libcuspatial-$LIBCUSPATIAL_VERSION/lib' > /etc/ld.so.conf.d/libcuspatial-$LIBCUSPATIAL_VERSION.conf"
            echo "    sudo ldconfig"
            exit 1
        fi
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac
