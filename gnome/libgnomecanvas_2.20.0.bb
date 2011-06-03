LICENSE = "GPL"
LIC_FILES_CHKSUM="file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605"
SECTION = "x11/gnome/libs"
DESCRIPTION = "A powerful object-oriented display"
PR = "r2"

inherit gnome

DEPENDS = "libglade libart-lgpl virtual/gail"

EXTRA_OECONF = "--disable-gtk-doc"

FILES_${PN} += "${libdir}/libglade/*/libcanvas.so"
FILES_${PN}-dbg += "${libdir}/libglade/*/.debug/"
FILES_${PN}-dev += "${libdir}/libglade/*/libcanvas.*a"
