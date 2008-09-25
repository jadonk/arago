DESCRIPTION = "Helper script for packaged-staging.bbclass"
PR = "r11"

SRC_URI = "file://stage-manager \
           file://stage-manager-ipkg \
           file://stage-manager-ipkg-build "
LICENSE = "GPLv2"

PACKAGE_ARCH = "all"

inherit native

DEPENDS = " "
PACKAGE_DEPENDS = " "
PATCHDEPENDENCY = ""
INHIBIT_DEFAULT_DEPS = "1"

do_install() {
	install -d ${STAGING_BINDIR}
	install -m 0755 ${WORKDIR}/stage-manager ${STAGING_BINDIR}
	install -m 0755 ${WORKDIR}/stage-manager-ipkg ${STAGING_BINDIR}
	install -m 0755 ${WORKDIR}/stage-manager-ipkg-build ${STAGING_BINDIR}
}

do_stage() {
	if [ -d ${SDK_PREFIX}/pstage -a "x${DEPLOY_DIR_PSTAGE}" != "x" ]; then
		install -d ${DEPLOY_DIR_PSTAGE}/
		cp -pPRr ${SDK_PREFIX}/pstage/* ${DEPLOY_DIR_PSTAGE}/
	fi
}
