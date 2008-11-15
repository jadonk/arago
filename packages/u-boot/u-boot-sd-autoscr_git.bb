require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "11e531777c772001b545fc2266fe017bbef0d59d"

PV = "2008.10-rc1+${PR}+git${SRCREV}"
PR ="r1"

SRC_URI = "git://git.denx.de/u-boot-arm.git;branch=omap3;protocol=git \
           file://sd-autoscr-r2.patch.txt;patch=1 \
          "

UBOOT_MACHINE_beagleboard = "omap3_beagle_config"
UBOOT_MACHINE_omap3evm = "omap3_evm_config"
UBOOT_MACHINE_overo = "omap3_overo_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
