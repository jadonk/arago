require u-boot.inc
UBOOT_IMAGE = "u-boot-sd-autoscr-${MACHINE}-${PV}-${PR}.bin"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

#SRCREV = "11e531777c772001b545fc2266fe017bbef0d59d"
SRCREV = "fb479d0418bc7c15d63a131beedbc6f1970fc295"

PV = "2008.10-rc1+${PR}+git${SRCREV}"
PR ="r2"

#SRC_URI = "git://git.denx.de/u-boot-arm.git;branch=omap3;protocol=git \
#           file://sd-autoscr-r2.patch.txt;patch=1 \
#          "
SRC_URI = "git://www.sakoman.net/git/u-boot-omap3;branch=common;protocol=git"

UBOOT_MACHINE_beagleboard = "omap3_beagle_config"
UBOOT_MACHINE_omap3evm = "omap3_evm_config"
UBOOT_MACHINE_overo = "omap3_overo_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
