# Arago base image + utilities selected by jkridner
# gives you a small image with basic media libraries and disk manipulation

ARAGO_EXTRA_INSTALL = "\
    alsa-lib \
    tslib \
    zlib \
    ncurses \
    libpng \
    jpeg \
    freetype \
    mtd-utils \
    thttpd \
    vim \
    screen \
    tar \
    bash \
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    dosfstools \
    "

# Disable this due to distribution restrictions
# DISTRO_SSH_DAEMON ?= "dropbear"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

# Disable these for now
# util-linux-mount util-linux-umount \

IMAGE_INSTALL = "\
    task-arago-base \
    ${DISTRO_SSH_DAEMON} \
    angstrom-version \
    ${ARAGO_EXTRA_INSTALL} \
    "

export IMAGE_BASENAME = "jkridner-ramdisk-image"
IMAGE_LINGUAS = ""

inherit image
