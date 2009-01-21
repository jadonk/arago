# Arago base image
# gives you a small images with basic media libraries

ARAGO_ALSA = "\
#    alsa-lib \
#    alsa-conf \
#    alsa-conf-base \
#    alsa-server \
    alsa-utils \
#    alsa-utils-aconnect \
#    alsa-utils-alsaconf \
#    alsa-utils-alsactl \
#    alsa-utils-alsamixer \
#    alsa-utils-amixer \
    alsa-utils-aplay \
#    alsa-utils-iecset \
#    alsa-utils-midi \
#    alsa-utils-speakertest \
    "

# ncurses-terminfo is rarely needed and won't fit in 16MB
ARAGO_NCURSES = "\
    ncurses \
#    ncurses-terminfo \
    ncurses-tools \
    "

# cppstub is needed to install libstdc++ in the image
ARAGO_EXTRA_INSTALL = "\
    ${ARAGO_ALSA} \
#    ${ARAGO_NCURSES} \
#    mtd-utils \
#    angstrom-led-config \
#    fbset \
#    usbutils \
#    mplayer \
    i2c-tools \
#    e2fsprogs \
#    e2fsprogs-e2fsck \
#    e2fsprogs-mke2fs \
#    dosfstools \
#    util-linux-fdisk \
#    util-linux-sfdisk \
    run-bootsh \
    opkg-nogpg \
#    arago-feed-configs \
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

export IMAGE_BASENAME = "arago-base-image"
IMAGE_LINGUAS = ""

inherit image
