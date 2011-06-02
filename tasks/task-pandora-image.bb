PR ="r1"
LICENSE="MIT"

inherit task

PANDORA_CORE = " \
    pandora-first-run-wizard hsetroot zenity shadow bash tzdata \
    slim slim-op-themes \
    coreutils \
    pandora-libpnd pandora-libpnd-minimenu gnome-icon-theme \
    pandora-scripts aufs2-util squashfs-tools \  
    pandora-wallpaper-official \
    pandora-xfce-defaults \
    pandora-firmware \
#    wl1251-modules \
    wireless-tools \
    wpa-supplicant \
    networkmanager netm-cli \
    pandora-skel pandora-state pandora-sudoers sudo sudo-enable-wheel-group \
    tslib tslib-tests tslib-calibrate pointercal \
    libsdl-x11 libsdl-mixer libsdl-image \
    libsdl-gfx libsdl-net libsdl-ttf \
    libpng \
    faad2 \
    mikmod \
    speex \  
    flac \
    audiofile \
    \
    boost \
    libvorbis tremor \
#    cheese \
"



XSERVER_BASE = " \
    ${XSERVER} \
    desktop-file-utils \
    iso-codes \
    mime-support\ 
    xdg-utils \
    xinit \
    xauth \
    xhost \
    xrdb \
    xrefresh \
    xset \
    xvinfo \
    encodings \
#fails    xterm \
    xmodmap \
    omap3-sgx-modules devmem2 \
    libgles-omap3 \
    \
    ttf-dejavu-common \
    ttf-dejavu-sans \
    ttf-dejavu-serif \
    ttf-dejavu-sans-mono \
    ttf-liberation-sans \
    ttf-liberation-serif \
    ttf-liberation-mono \
    \    
    gtk-touchscreen-mode-enable \
    libgtkstylus \
    fbgrab fbset fbset-modes \ 
    inotify-tools \
    gksu \
"

RDEPENDS_${PN} = " \
    ${XSERVER_BASE} \
    dropbear \
    task-xfce46-base \
    task-xfce46-extras \
    ${PANDORA_CORE} \
"

RRECOMMENDS_${PN} += "kernel-modules"

PACKAGE_ARCH = "${MACHINE_ARCH}"
