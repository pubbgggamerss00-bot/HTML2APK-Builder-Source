package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6822a;

    public static class a extends z {
    }

    public static z a() {
        return new z("Protocol message contained an invalid tag (zero).");
    }

    public static z b() {
        return new z("Protocol message had invalid UTF-8.");
    }

    public static a c() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static z d() {
        return new z("CodedInputStream encountered a malformed varint.");
    }

    public static z e() {
        return new z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static z f() {
        return new z("Failed to parse the message.");
    }

    public static z g() {
        return new z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
