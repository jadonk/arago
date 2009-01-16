SRC_URI += "\
    file://run_boot.sh \
    "

FILES_${PN}-boot = "${sysconfdir}/init.d/run_boot.sh /media/mmcblk0p1"
INITSCRIPT_PACKAGES = "${PN}-run_boot.sh"
INITSCRIPT_PARAMS_${PN}-boot = "start 99 S ."
INITSCRIPT_NAME_${PN}-boot = "run_boot.sh"

inherit update-rc.d
