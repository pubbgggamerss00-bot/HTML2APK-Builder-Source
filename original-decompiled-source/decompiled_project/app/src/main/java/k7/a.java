package k7;

import hi.b0;
import hi.n;
import hi.v;
import k7.f;
import tg.i;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: k7.a$a, reason: collision with other inner class name */
    public static final class C0162a {

        /* renamed from: a, reason: collision with root package name */
        public final v f16006a = n.f13098a;

        /* renamed from: b, reason: collision with root package name */
        public final double f16007b = 0.02d;

        /* renamed from: c, reason: collision with root package name */
        public final long f16008c = 10485760;

        /* renamed from: d, reason: collision with root package name */
        public final long f16009d = 262144000;

        /* renamed from: e, reason: collision with root package name */
        public final i f16010e = i.f28768a;
    }

    public interface b {
        f.b a();

        void b();
    }

    public interface c extends AutoCloseable {
        f.a K();

        b0 c();

        b0 getData();
    }

    f.a a(String str);

    f.b b(String str);

    n getFileSystem();
}
