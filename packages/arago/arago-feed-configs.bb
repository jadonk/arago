DESCRIPTION = "Configuration files for online package repositories aka feeds"

#PV = "${DISTRO_VERSION}"
PR = "r2"

COMPATIBLE_MACHINE = "arago|beagleboard"

# This gets set in the distro/local configuration
FEED_BASEPATH ?= "feeds/"

do_compile() {
        mkdir -p ${S}/${sysconfdir}/opkg

	echo "src/gz arago ${ARAGO_URI}/${FEED_BASEPATH}arago" > ${S}/${sysconfdir}/opkg/arago-feed.conf
        echo "src/gz ${FEED_ARCH} ${ARAGO_URI}/${FEED_BASEPATH}${FEED_ARCH}" >  ${S}/${sysconfdir}/opkg/${FEED_ARCH}-feed.conf
        echo "src/gz omap3evm ${ARAGO_URI}/${FEED_BASEPATH}omap3evm" >  ${S}/${sysconfdir}/opkg/omap3evm-feed.conf.sample
        echo "src/gz beagleboard ${ARAGO_URI}/${FEED_BASEPATH}beagleboard" >  ${S}/${sysconfdir}/opkg/beagleboard-feed.conf.sample
        echo "src/gz davinci-dvevm ${ARAGO_URI}/${FEED_BASEPATH}davinci-dvevm" >  ${S}/${sysconfdir}/opkg/davinci-dvevm-feed.conf.sample
	echo "src/gz no-arch ${ARAGO_URI}/${FEED_BASEPATH}all" > ${S}/${sysconfdir}/opkg/noarch-feed.conf
}


do_install () {
	install -d ${D}${sysconfdir}/opkg
	install -m 0644  ${S}/${sysconfdir}/opkg/* ${D}${sysconfdir}/opkg/
}

FILES_${PN} = " \
	${sysconfdir}/opkg/arago-feed.conf \
	${sysconfdir}/opkg/omap3evm-feed.conf.sample \
	${sysconfdir}/opkg/beagleboard-feed.conf.sample \
	${sysconfdir}/opkg/davinci-dvevm-feed.conf.sample \
	${sysconfdir}/opkg/${FEED_ARCH}-feed.conf \
	${sysconfdir}/opkg/noarch-feed.conf \
"

CONFFILES_${PN} += " \
	${sysconfdir}/opkg/arago-feed.conf \
	${sysconfdir}/opkg/omap3evm-feed.conf.sample \
	${sysconfdir}/opkg/beagleboard-feed.conf.sample \
	${sysconfdir}/opkg/davinci-dvevm-feed.conf.sample \
	${sysconfdir}/opkg/${FEED_ARCH}-feed.conf \
	${sysconfdir}/opkg/noarch-feed.conf \
"
