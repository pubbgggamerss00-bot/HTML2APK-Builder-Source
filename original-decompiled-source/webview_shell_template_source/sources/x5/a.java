package x5;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15157a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f15158b;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.j.d("forName(...)", charsetForName);
        f15157a = charsetForName;
        kotlin.jvm.internal.j.d("forName(...)", Charset.forName("UTF-16"));
        kotlin.jvm.internal.j.d("forName(...)", Charset.forName("UTF-16BE"));
        kotlin.jvm.internal.j.d("forName(...)", Charset.forName("UTF-16LE"));
        kotlin.jvm.internal.j.d("forName(...)", Charset.forName("US-ASCII"));
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.j.d("forName(...)", charsetForName2);
        f15158b = charsetForName2;
    }
}
