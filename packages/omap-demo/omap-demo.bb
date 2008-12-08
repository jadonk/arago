DESCRIPTION = "OMAP35x LCD/touchscreen/audio demo"
PR = "r1"

SRC_URI = "\
http://arago-project.org/files/short-term/demo/demo-app-src.tar.gz \
http://arago-project.org/files/short-term/demo/images.tar.bz2 \
"

S = "${WORKDIR}"

do_compile() {
	${CC} -o omap-demo demo.c
}

do_install() {
	install -d ${D}/usr/tests
	install -m 0755 omap-demo ${D}/usr/tests
	install -d ${D}/usr/images
	install -m 0755 images/* ${D}/usr/images
}

PACKAGES += "omap-demo-images"

FILES_${PN} += "/usr/tests"
FILES_${PN}-dbg += "/usr/tests/.debug"

FILES_omap-demo-images += "/usr/images"

RDEPENDS_omap-demo += "omap-demo-images"
