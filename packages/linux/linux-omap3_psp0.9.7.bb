SECTION = "kernel"
DESCRIPTION = "Linux kernel for OMAP3 EVM from PSP"
LICENSE = "GPL"
KERNEL_IMAGETYPE = "uImage"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/linux-omap3-psp/${MACHINE}"

KVER = "2.6.22"
PSPREL = "0.9.7"

PV = "${KVER}+psp${PSPREL}"
PR = "0"

SRC_URI = "file://${PSPREL}/kernel-${KVER}.tar.gz"

COMPATIBLE_MACHINE = "omap3evm"

S = "${WORKDIR}/linux/kernel_org/2.6_kernel"

inherit kernel

do_configure() {
		make omap3evm_defconfig
}
