DESCRIPTION = "C++ stub to link against libstdc++"
PR = "r2"

SRC_URI = "file://cppstub.cpp"

S = "${WORKDIR}"

do_compile() {
	${CXX} -o cppstub cppstub.cpp
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 cppstub ${D}${bindir}
}
