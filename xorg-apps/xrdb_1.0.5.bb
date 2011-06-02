require xorg-app-common.inc

DESCRIPTION = "X server resource database utility"
LICENSE = "xrdb"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641deddaa80fe7ca88e944e1fd94a94"
DEPENDS += "libxmu"
PE = "1"
PR = "r2"

SRC_URI += "file://60XDefaults.sh"

do_install_append() {
    install -d ${D}${sysconfdir}/X11/Xsession.d/
    install -m 0755 ${WORKDIR}/60XDefaults.sh ${D}${sysconfdir}/X11/Xsession.d/
}

SRC_URI[md5sum] = "9c30b8e1709d5367beb7706146640c07"
SRC_URI[sha256sum] = "c24d08939250f10238fd1b984707bfa0901ba9c55fa36b67d91eb12b500500aa"
