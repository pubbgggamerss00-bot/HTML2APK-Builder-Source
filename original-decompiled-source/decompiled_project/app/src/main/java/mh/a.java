package mh;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18237a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f18238b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f18239c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f18240d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Charset f18241e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile Charset f18242f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.r.d(charsetForName, "forName(...)");
        f18238b = charsetForName;
        kotlin.jvm.internal.r.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.r.d(Charset.forName("UTF-16BE"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.r.d(charsetForName2, "forName(...)");
        f18239c = charsetForName2;
        kotlin.jvm.internal.r.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName3 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.r.d(charsetForName3, "forName(...)");
        f18240d = charsetForName3;
    }
}
