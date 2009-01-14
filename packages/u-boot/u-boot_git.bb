require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

#SRCREV = "2381673c5d0f793f0873ba5743d2745c585e1f6d"
SRCREV = "${@bb.fetch.get_srcrev(d)}"

PV = "${PR}+git${SRCREV}"
PR ="r5"

#SRC_URI = "git://www.sakoman.net/git/u-boot-arm;branch=omap3-j24;protocol=git"
SRC_URI = "git://gitorious.org/beagleboard-default-u-boot/jason-clone.git;branch=jdk;protocol=git"

UBOOT_MACHINE_beagleboard = "omap3_beagle_config"
UBOOT_MACHINE_omap3evm = "omap3_evm_config"
UBOOT_MACHINE_overo = "omap3_overo_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
