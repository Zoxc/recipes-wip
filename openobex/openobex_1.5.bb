DESCRIPTION = "The Openobex project is an open source implementation of the \
Object Exchange (OBEX) protocol."
HOMEPAGE = "http://openobex.triq.net"
SECTION = "libs"
PROVIDES = "openobex-apps"
DEPENDS = "libusb bluez4"
LICENSE = "GPL"
LIC_FILES_CHKSUM="file://COPYING;md5=eb723b61539feef013de476e68b5c50a \
		  file://COPYING.LIB;md5=a6f89e2100d9b6cdffcea4f398e37343"
PR = "r4"

SRC_URI = "${KERNELORG_MIRROR}/linux/bluetooth/openobex-${PV}.tar.gz \
           file://disable-cable-test.patch;patch=1 \
	   file://libusb_crosscompile_check.patch;patch=1"

inherit autotools binconfig pkgconfig

EXTRA_OECONF = "--enable-apps --enable-syslog --enable-dump \
                --with-usb=${STAGING_LIBDIR}/.. --with-bluez=${STAGING_LIBDIR}/.."

# how to stop shlibrename from renaming -apps?
PACKAGES += "openobex-apps"
FILES_${PN} = "${libdir}/lib*.so.*"
FILES_${PN}-dev += "${bindir}/openobex-config"
FILES_${PN}-apps = "${bindir}/*"
