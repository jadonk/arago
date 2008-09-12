PR = "r10"

inherit sdk

require gcc-${PV}.inc
require gcc-cross-sdk.inc
require gcc-configure-sdk.inc
require gcc-package-sdk.inc

DEPENDS += "gmp-native mpfr-native"

EXTRA_OECONF += "--disable-libunwind-exceptions --disable-libssp \
		--disable-libgomp --disable-libmudflap \
		--with-mpfr=${STAGING_DIR_NATIVE}${layout_exec_prefix}"

# Hack till we fix *libc properly
do_install_append() {
        cp -a ${D}${gcclibdir}/${TARGET_SYS}/${BINV}/include-fixed/* ${D}${gcclibdir}/${TARGET_SYS}/${BINV}/include/
}
