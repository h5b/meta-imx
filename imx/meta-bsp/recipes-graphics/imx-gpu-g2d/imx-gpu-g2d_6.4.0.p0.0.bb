require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bdfc6b42b13b691e534df66c96d31d81"
SRC_URI[aarch64.sha256sum] = "8802f05c8f89c9dd6994444a394f18513f14fb7245dfd01ca0d41582c34b22c0"
SRC_URI[arm.md5sum] = "0a689256b7fbf3b29ff518e163379a66"
SRC_URI[arm.sha256sum] = "1a947c384adae6364a31cb121602aefdb3862ec953e1f7d4a1d01e5470884830"
