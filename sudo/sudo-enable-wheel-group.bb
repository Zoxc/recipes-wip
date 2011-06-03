PR = "r1"

RDEPENDS_${PN} = "sudo"
LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
ALLOW_EMPTY_${PN} = "1"
PACKAGE_ARCH = "all"

# Edit sudoers to allow the use of the wheel group and non root users to mount/shutdown etc.
# Please consider this when using.

pkg_postinst() {
#!/bin/sh
mkdir -p $D${sysconfdir}/
touch $D${sysconfdir}/sudoers
sed -i /# %wheel/d $D${sysconfdir}/sudoers
echo '%wheel	ALL=(ALL) ALL' >> $D${sysconfdir}/sudoers
sed -i /# %users/d $D${sysconfdir}/sudoers
echo '%users  ALL=/sbin/mount /cdrom,/sbin/umount /cdrom' >> $D${sysconfdir}/sudoers
echo '%users  localhost=/sbin/shutdown -h now' >> $D${sysconfdir}/sudoers
}
