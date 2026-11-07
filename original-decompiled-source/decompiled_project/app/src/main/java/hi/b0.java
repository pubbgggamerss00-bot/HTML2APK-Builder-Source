package hi;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b0 implements Comparable<b0> {

    /* renamed from: b, reason: collision with root package name */
    public static final String f13033b;

    /* renamed from: a, reason: collision with root package name */
    public final j f13034a;

    public static final class a {
        public static b0 a(String str) {
            kotlin.jvm.internal.r.e(str, "<this>");
            j jVar = ii.c.f14537a;
            g gVar = new g();
            gVar.F0(str);
            return ii.c.d(gVar, false);
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.r.d(separator, "separator");
        f13033b = separator;
    }

    public b0(j bytes) {
        kotlin.jvm.internal.r.e(bytes, "bytes");
        this.f13034a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = ii.c.a(this);
        j jVar = this.f13034a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < jVar.d() && jVar.i(iA) == 92) {
            iA++;
        }
        int iD = jVar.d();
        int i10 = iA;
        while (iA < iD) {
            if (jVar.i(iA) == 47 || jVar.i(iA) == 92) {
                arrayList.add(jVar.n(i10, iA));
                i10 = iA + 1;
            }
            iA++;
        }
        if (i10 < jVar.d()) {
            arrayList.add(jVar.n(i10, jVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        j jVar = ii.c.f14537a;
        j jVarO = this.f13034a;
        int iK = j.k(jVarO, jVar);
        if (iK == -1) {
            iK = j.k(jVarO, ii.c.f14538b);
        }
        if (iK != -1) {
            jVarO = j.o(jVarO, iK + 1, 0, 2);
        } else if (g() != null && jVarO.d() == 2) {
            jVarO = j.f13075d;
        }
        return jVarO.q();
    }

    public final b0 c() {
        j jVar = ii.c.f14540d;
        j jVar2 = this.f13034a;
        if (kotlin.jvm.internal.r.a(jVar2, jVar)) {
            return null;
        }
        j jVar3 = ii.c.f14537a;
        if (kotlin.jvm.internal.r.a(jVar2, jVar3)) {
            return null;
        }
        j prefix = ii.c.f14538b;
        if (kotlin.jvm.internal.r.a(jVar2, prefix)) {
            return null;
        }
        j suffix = ii.c.f14541e;
        jVar2.getClass();
        kotlin.jvm.internal.r.e(suffix, "suffix");
        int iD = jVar2.d();
        byte[] bArr = suffix.f13076a;
        if (jVar2.l(iD - bArr.length, suffix, bArr.length) && (jVar2.d() == 2 || jVar2.l(jVar2.d() - 3, jVar3, 1) || jVar2.l(jVar2.d() - 3, prefix, 1))) {
            return null;
        }
        int iK = j.k(jVar2, jVar3);
        if (iK == -1) {
            iK = j.k(jVar2, prefix);
        }
        if (iK == 2 && g() != null) {
            if (jVar2.d() == 3) {
                return null;
            }
            return new b0(j.o(jVar2, 0, 3, 1));
        }
        if (iK == 1) {
            kotlin.jvm.internal.r.e(prefix, "prefix");
            if (jVar2.l(0, prefix, prefix.d())) {
                return null;
            }
        }
        if (iK != -1 || g() == null) {
            return iK == -1 ? new b0(jVar) : iK == 0 ? new b0(j.o(jVar2, 0, 1, 1)) : new b0(j.o(jVar2, 0, iK, 1));
        }
        if (jVar2.d() == 2) {
            return null;
        }
        return new b0(j.o(jVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(b0 b0Var) {
        b0 other = b0Var;
        kotlin.jvm.internal.r.e(other, "other");
        return this.f13034a.compareTo(other.f13034a);
    }

    public final b0 d(b0 other) {
        kotlin.jvm.internal.r.e(other, "other");
        j jVar = other.f13034a;
        int iA = ii.c.a(this);
        j jVar2 = this.f13034a;
        b0 b0Var = iA == -1 ? null : new b0(jVar2.n(0, iA));
        int iA2 = ii.c.a(other);
        if (!kotlin.jvm.internal.r.a(b0Var, iA2 != -1 ? new b0(jVar.n(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i10 = 0;
        while (i10 < iMin && kotlin.jvm.internal.r.a(arrayListA.get(i10), arrayListA2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && jVar2.d() == jVar.d()) {
            return a.a(".");
        }
        if (arrayListA2.subList(i10, arrayListA2.size()).indexOf(ii.c.f14541e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.r.a(jVar, ii.c.f14540d)) {
            return this;
        }
        g gVar = new g();
        j jVarC = ii.c.c(other);
        if (jVarC == null && (jVarC = ii.c.c(this)) == null) {
            jVarC = ii.c.f(f13033b);
        }
        int size = arrayListA2.size();
        for (int i11 = i10; i11 < size; i11++) {
            gVar.k0(ii.c.f14541e);
            gVar.k0(jVarC);
        }
        int size2 = arrayListA.size();
        while (i10 < size2) {
            gVar.k0((j) arrayListA.get(i10));
            gVar.k0(jVarC);
            i10++;
        }
        return ii.c.d(gVar, false);
    }

    public final b0 e(String child) {
        kotlin.jvm.internal.r.e(child, "child");
        g gVar = new g();
        gVar.F0(child);
        return ii.c.b(this, ii.c.d(gVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && kotlin.jvm.internal.r.a(((b0) obj).f13034a, this.f13034a);
    }

    public final Path f() {
        Path path = Paths.get(this.f13034a.q(), new String[0]);
        kotlin.jvm.internal.r.d(path, "get(...)");
        return path;
    }

    public final Character g() {
        j jVar = ii.c.f14537a;
        j jVar2 = this.f13034a;
        if (j.g(jVar2, jVar) != -1 || jVar2.d() < 2 || jVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) jVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f13034a.hashCode();
    }

    public final File toFile() {
        return new File(this.f13034a.q());
    }

    public final String toString() {
        return this.f13034a.q();
    }
}
