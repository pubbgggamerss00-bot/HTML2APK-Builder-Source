package mh;

import f9.nb;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import lh.p;

/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f18266a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f18267b;

    /* renamed from: c, reason: collision with root package name */
    public final b f18268c;

    /* renamed from: d, reason: collision with root package name */
    public a f18269d;

    public static final class a extends qg.c<String> {
        public a() {
        }

        @Override // qg.a
        public final int c() {
            return i.this.f18266a.groupCount() + 1;
        }

        @Override // qg.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            String strGroup = i.this.f18266a.group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // qg.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // qg.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public static final class b extends qg.a<g> {
        public b() {
        }

        @Override // qg.a
        public final int c() {
            return i.this.f18266a.groupCount() + 1;
        }

        @Override // qg.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof g) {
                return super.contains((g) obj);
            }
            return false;
        }

        public final g e(int i10) {
            Matcher matcher = i.this.f18266a;
            jh.g gVarQ = jh.j.q(matcher.start(i10), matcher.end(i10));
            if (gVarQ.f15744a < 0) {
                return null;
            }
            String strGroup = matcher.group(i10);
            kotlin.jvm.internal.r.d(strGroup, "group(...)");
            return new g(strGroup, gVarQ);
        }

        @Override // qg.a, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<g> iterator() {
            return new p.a(new lh.p(new qg.w(new jh.g(0, size() - 1, 1)), new nb(this, 2)));
        }
    }

    public i(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.r.e(input, "input");
        this.f18266a = matcher;
        this.f18267b = input;
        this.f18268c = new b();
    }

    @Override // mh.h
    public final List<String> a() {
        if (this.f18269d == null) {
            this.f18269d = new a();
        }
        a aVar = this.f18269d;
        kotlin.jvm.internal.r.b(aVar);
        return aVar;
    }

    @Override // mh.h
    public final jh.g b() {
        Matcher matcher = this.f18266a;
        return jh.j.q(matcher.start(), matcher.end());
    }

    @Override // mh.h
    public final String getValue() {
        String strGroup = this.f18266a.group();
        kotlin.jvm.internal.r.d(strGroup, "group(...)");
        return strGroup;
    }

    @Override // mh.h
    public final i next() {
        Matcher matcher = this.f18266a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f18267b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.r.d(matcher2, "matcher(...)");
        return m.a(matcher2, iEnd, charSequence);
    }
}
