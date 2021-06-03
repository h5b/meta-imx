DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=85d06b38f17b935ca11784d67075b846" 

SRC_URI[arm-fb.md5sum] = "17bb15b7d0b8f7c9c4c2fd3d270eeff7"
SRC_URI[arm-fb.sha256sum] = "f3f908a96c4ff4a805c0c79d839521f435a96ac5b51d00da9f5313567d652e04"

SRC_URI[arm-wayland.md5sum] = "9776d61dff1ebbccef99adee75dd81b4"
SRC_URI[arm-wayland.sha256sum] = "4a1c8787147a8559c80d7fa108093e2b701cda141136ce438450a81776b00000"

SRC_URI[arm-x11.md5sum] = "dc17cf5f92d0aab4a4b1e7a3cef4f4d3"
SRC_URI[arm-x11.sha256sum] = "43aa93d9c06430a3b4171f9cd3095d3698a44631a6fd49b2435066a6ef729e55"

SRC_URI[aarch64-fb.md5sum] = "67a3ee2e240e231b40e9e4af42ad7327"
SRC_URI[aarch64-fb.sha256sum] = "c3cc0ab7bda64d05c572b8ae0653b9f88370d0f696c6e69a3a30ecda45612fc0"

SRC_URI[aarch64-wayland.md5sum] = "ceb101df8441d437043777d528bbff1c"
SRC_URI[aarch64-wayland.sha256sum] = "7c3f1eab7a509f5ce67c01fae8cd756f4ebf90ca234957da05f986fff29716bd"

SRC_URI[aarch64-x11.md5sum] = "076ebf8b31c98536be437c212385ce21"
SRC_URI[aarch64-x11.sha256sum] = "6ae1148bf1f04433d098d03f037e346618964ff5f927dc9c303deae4b7812ac8"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
