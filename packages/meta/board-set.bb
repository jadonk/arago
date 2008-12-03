DESCRIPTION = "Meta-package for Arago board sets (kernel+bootloaders)"
PR = "r1"

# Generic "arago" machine is not part of this list on purpose
# so it would require setting MACHINE explicitly
COMPATIBLE_MACHINE = "omap3evm|beagleboard|davinci-dvevm"

DEPENDS = "virtual/kernel u-boot"

DEPENDS_append_omap3evm = " x-load"
DEPENDS_append_beagleboard = " x-load"
DEPENDS_append_davinci-dvevm = " ubl"

# This is not really required, as "arago" is not compatibe
DEPENDS_arago = ""

inherit meta
