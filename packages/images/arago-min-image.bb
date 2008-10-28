#Angstrom minimalist image
#gives you a small images with ssh access

ARAGO_EXTRA_INSTALL = "alsa-lib ncurses mtd-utils thttpd zlib tslib libpng jpeg freetype"

#ARAGO_EXTRA_INSTALL ?= ""

#DISTRO_SSH_DAEMON ?= "dropbear"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"


IMAGE_INSTALL = "task-arago-boot \
            util-linux-mount util-linux-umount \
            ${DISTRO_SSH_DAEMON} \
            angstrom-version \
	    ${ARAGO_EXTRA_INSTALL} \
	   "

export IMAGE_BASENAME = "minimalist-image"
IMAGE_LINGUAS = ""

inherit image
