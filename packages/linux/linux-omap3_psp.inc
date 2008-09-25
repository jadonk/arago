SECTION = "kernel"
DESCRIPTION = "Linux kernel for OMAP3 EVM from PSP"
LICENSE = "GPL"
KERNEL_IMAGETYPE = "uImage"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/linux-omap3-psp/${MACHINE}"

KVER = "2.6.22"

PV = "${KVER}+psp${PSPREL}"

SRC_URI = "file://${PSPREL}/kernel-${KVER}.tar.gz"

COMPATIBLE_MACHINE = "omap3evm"

S = "${WORKDIR}/linux/kernel_org/2.6_kernel"

inherit kernel

do_unpack_check() {
	if [ ! -e  ${FILESDIR}/${PSPREL}/kernel-${KVER}.tar.gz ]; then
		echo "=============================================================================="
		echo "The kernel package kernel-${KVER}.tar.gz from PSP release OMAP35x_SDK_${PSPREL}"
		echo "could not be found in ${FILESDIR}/${PSPREL}/"
		echo "Please place the above kernel package in the directory specified:"
		echo " $ cp OMAP35x_SDK_${PSPREL}/src/kernel-${KVER}.tar.gz ${FILESDIR}/${PSPREL}/"
		echo "=============================================================================="
		exit 1
	fi
}

do_configure() {
	make omap3evm_defconfig
}

addtask unpack_check before do_unpack
