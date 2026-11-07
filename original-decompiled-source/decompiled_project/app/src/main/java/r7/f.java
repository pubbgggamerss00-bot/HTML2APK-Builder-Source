package r7;

import b8.m;
import g7.l;
import java.util.LinkedHashMap;
import java.util.Map;
import r7.c;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final i f23228a;

    /* renamed from: b, reason: collision with root package name */
    public final b f23229b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f23230a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f23231b;

        /* renamed from: c, reason: collision with root package name */
        public final long f23232c;

        public a(l lVar, Map<String, ? extends Object> map, long j10) {
            this.f23230a = lVar;
            this.f23231b = map;
            this.f23232c = j10;
        }
    }

    public static final class b extends m<c.b, a> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f23233d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, f fVar) {
            super(j10);
            this.f23233d = fVar;
        }

        @Override // b8.m
        public final void a(c.b bVar, a aVar, a aVar2) {
            a aVar3 = aVar;
            this.f23233d.f23228a.c(bVar, aVar3.f23230a, aVar3.f23231b, aVar3.f23232c);
        }
    }

    public f(long j10, i iVar) {
        this.f23228a = iVar;
        this.f23229b = new b(j10, this);
    }

    @Override // r7.h
    public final c.C0257c a(c.b bVar) {
        a aVar = (a) this.f23229b.f3675b.get(bVar);
        if (aVar != null) {
            return new c.C0257c(aVar.f23230a, aVar.f23231b);
        }
        return null;
    }

    @Override // r7.h
    public final void b(long j10) {
        this.f23229b.d(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r7.h
    public final void c(c.b bVar, l lVar, Map<String, ? extends Object> map, long j10) {
        b bVar2 = this.f23229b;
        long j11 = bVar2.f3674a;
        LinkedHashMap linkedHashMap = bVar2.f3675b;
        if (j10 > j11) {
            Object objRemove = linkedHashMap.remove(bVar);
            if (objRemove != null) {
                bVar2.f3676c = bVar2.b() - bVar2.c(bVar, objRemove);
                bVar2.a(bVar, objRemove, null);
            }
            this.f23228a.c(bVar, lVar, map, j10);
            return;
        }
        a aVar = new a(lVar, map, j10);
        Object objPut = linkedHashMap.put(bVar, aVar);
        bVar2.f3676c = bVar2.c(bVar, aVar) + bVar2.b();
        if (objPut != null) {
            bVar2.f3676c = bVar2.b() - bVar2.c(bVar, objPut);
            bVar2.a(bVar, objPut, aVar);
        }
        bVar2.d(bVar2.f3674a);
    }

    @Override // r7.h
    public final void clear() {
        this.f23229b.d(-1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r7.h
    public final boolean d(c.b bVar) {
        b bVar2 = this.f23229b;
        Object objRemove = bVar2.f3675b.remove(bVar);
        if (objRemove != null) {
            bVar2.f3676c = bVar2.b() - bVar2.c(bVar, objRemove);
            bVar2.a(bVar, objRemove, null);
        }
        return objRemove != null;
    }

    @Override // r7.h
    public final long getSize() {
        return this.f23229b.b();
    }
}
