SECTION = "kernel"
DESCRIPTION = "Linux kernel for OMAP3 EVM from PSP, based on linux-omap2 kernel"
LICENSE = "GPL"
KERNEL_IMAGETYPE = "uImage"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/linux-omap3-psp/${MACHINE}/${PSPREL}"

KVER = "2.6.26"

PV = "${KVER}+psp${PSPREL}"

COMPATIBLE_MACHINE = "omap3evm"

S = "${WORKDIR}/git"

inherit kernel

do_configure() {
	make omap3_evm_defconfig
}
