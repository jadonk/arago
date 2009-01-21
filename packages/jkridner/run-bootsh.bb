DESCRIPTION = "Script to look for /media/mmcblk0p1/boot.sh"
LICENSE = "BSD"
HOMEPAGE = "http://beagleboard.org"

inherit update-rc.d

PN = "run-bootsh"
PV = "0.1"

SRC_URI += "\
    file://run_boot.sh \
    "

do_install() {
	install -d ${D}/${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/run_boot.sh ${D}/${sysconfdir}/init.d/run_boot.sh
}  

FILES_${PN} = "${sysconfdir}/init.d/run_boot.sh"
INITSCRIPT_PACKAGES = "${PN}-run_boot.sh"
INITSCRIPT_PARAMS_${PN}-boot = "start 99 S ."
INITSCRIPT_NAME_${PN}-boot = "run_boot.sh"