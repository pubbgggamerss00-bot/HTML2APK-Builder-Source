package s4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@vg.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends vg.i implements eh.p<Object, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f24246a;

    /* renamed from: b, reason: collision with root package name */
    public e f24247b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24248c;

    /* renamed from: d, reason: collision with root package name */
    public int f24249d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<e<Object>> f24251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24252g;

    @vg.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24253a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e<Object> f24254b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<Object> eVar, tg.e<? super a> eVar2) {
            super(1, eVar2);
            this.f24254b = eVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(tg.e<?> eVar) {
            return new a(this.f24254b, eVar);
        }

        @Override // eh.l
        public final Object invoke(tg.e<? super pg.f0> eVar) {
            return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24253a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f24253a = 1;
                if (this.f24254b.a() == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, ArrayList arrayList, tg.e eVar) {
        super(2, eVar);
        this.f24251f = list;
        this.f24252g = arrayList;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        h hVar = new h(this.f24251f, this.f24252g, eVar);
        hVar.f24250e = obj;
        return hVar;
    }

    @Override // eh.p
    public final Object invoke(Object obj, tg.e<Object> eVar) {
        return ((h) create(obj, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[RETURN] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        e eVar;
        Iterator it2;
        Object obj2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24249d;
        if (i10 == 0) {
            pg.q.b(obj);
            obj = this.f24250e;
            it = this.f24251f.iterator();
            list = this.f24252g;
        } else if (i10 == 1) {
            obj2 = this.f24248c;
            e eVar2 = this.f24247b;
            it2 = this.f24246a;
            List list2 = (List) this.f24250e;
            pg.q.b(obj);
            eVar = eVar2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new a(eVar, null));
                this.f24250e = list;
                this.f24246a = it2;
                this.f24247b = null;
                this.f24248c = null;
                this.f24249d = 2;
                obj = eVar.b();
                if (obj != aVar) {
                    it = it2;
                }
                return aVar;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f24246a;
            list = (List) this.f24250e;
            pg.q.b(obj);
        }
        if (!it.hasNext()) {
            e eVar3 = (e) it.next();
            this.f24250e = list;
            this.f24246a = it;
            this.f24247b = eVar3;
            this.f24248c = obj;
            this.f24249d = 1;
            Object objC = eVar3.c();
            if (objC != aVar) {
                Iterator it3 = it;
                obj2 = obj;
                obj = objC;
                eVar = eVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return aVar;
        }
    }
}
