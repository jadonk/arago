PSPREL = "2.0.0.1"
PR = "r1"

require linux-omap3_psp2.inc

SRCREV = "9882ca1b309ef95e528fe048499b831f99a688a3"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/tmlind/linux-omap-2.6.git;protocol=git"

SRC_URI_append_omap3evm = " \
file://0001-OMAP35x-USB-USB-patches-on-the-2.6.26-baseline.patch;patch=1 \
file://0002-OMAP35x-USB-configuration-options-update.patch;patch=1 \
file://0003-OMAP35x-Power-Management-Patches.patch;patch=1 \
file://0004-OMAP35x-Fix-compilation-warnings.patch;patch=1 \
file://0005-OMAP35X-Add-OMAP35x-configuration.patch;patch=1 \
file://0006-OMAP35x-Add-Audio-Codec-support.patch;patch=1 \
file://0007-OMAP35x-Add-ISP-camera-support.patch;patch=1 \
file://0008-OMAP35x-Add-resizer-driver-Support.patch;patch=1 \
file://0009-OMAP35x-Add-Display-library-and-encoder-support.patch;patch=1 \
file://0010-OMAP35x-Add-V4L2-drivers-for-video-pipeline.patch;patch=1 \
file://0011-OMAP35x-Add-support-BT656-Capture-interface.patch;patch=1 \
file://0012-OMAP35x-Workaround-for-video-crash-issue.patch;patch=1 \
file://0013-OMAP-35x-Update-default-kernel-configuration.patch;patch=1 \
file://0014-OMAP35x-Add-FBDEV-changes.patch;patch=1 \
file://0015-OMAP-35x-Display-driver-makefile-update.patch;patch=1 \
file://0016-OMAP35x-Fix-for-FB-Sync-Loss-issue.patch;patch=1 \
file://0017-OMAP-35x-Merging-fixes-from-OMAP-mailing-list.patch;patch=1 \
file://0018-OMAP35x-Fix-for-Capture-Plug-UNplug-issue.patch;patch=1 \
file://0019-OMAP-35x-Update-default-OMAP-EVm-configuration.patch;patch=1 \
file://0020-OMAP35x-Enable-NAND-Support.patch;patch=1 \
file://0021-OMAP35x-fix-compiler-warning-with-ALSA-Mixer.patch;patch=1 \
file://0022-OMAP35x-Fix-USB-gadget-driver-registration-failure.patch;patch=1 \
file://0023-OMAP35x-Fix-for-lcd-clr-frame-rate-and-mem-order.patch;patch=1 \
file://0024-OMAP35x-Add-MMC-NAND-to-default-config.patch;patch=1 \
"
