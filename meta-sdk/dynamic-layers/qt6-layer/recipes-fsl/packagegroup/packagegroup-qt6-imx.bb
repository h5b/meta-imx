# Copyright 2019-20 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for i.MX Qt6"
LICENSE = "MIT"

inherit packagegroup

# Install Freescale QT demo applications
QT6_IMAGE_INSTALL_APPS = ""
#QT6_IMAGE_INSTALL_APPS:imxgpu3d = "${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-qtapplications", "", d)}"

# Install fonts
QT6_FONTS = "ttf-dejavu-common ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-serif "

# Install qtquick3d
QT6_QTQUICK3D = "qtquick3d qtquick3d-dev"

QT6_IMAGE_INSTALL = ""
QT6_IMAGE_INSTALL_common = " \
    ${QT6_QTQUICK3D} \
    ${QT6_FONTS} \
    ${QT6_IMAGE_INSTALL_APPS} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'libxkbcommon', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland qtwayland-plugins', '', d)}\
    "
QT6_IMAGE_INSTALL:imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11','${QT6_IMAGE_INSTALL_common}', \
    'qtbase qtbase-plugins', d)}"

QT6_IMAGE_INSTALL:imxpxp = "${@bb.utils.contains('DISTRO_FEATURES', 'x11','${QT6_IMAGE_INSTALL_common}', \
    'qtbase qtbase-examples qtbase-plugins', d)}"

#QT6_IMAGE_INSTALL:imxgpu3d = " \
#    ${QT6_IMAGE_INSTALL_common} \
#    gstreamer1.0-plugins-good-qt"

RDEPENDS:${PN} += " \
    ${QT6_IMAGE_INSTALL} \
"