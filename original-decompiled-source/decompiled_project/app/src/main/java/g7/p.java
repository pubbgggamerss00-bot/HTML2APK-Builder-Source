package g7;

import android.content.Context;
import e9.w0;
import g7.j;
import g7.t;
import w7.f;

/* loaded from: classes.dex */
public interface p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11516a;

        /* renamed from: b, reason: collision with root package name */
        public final f.b f11517b = f.b.f31363o;

        /* renamed from: c, reason: collision with root package name */
        public f f11518c = null;

        /* renamed from: d, reason: collision with root package name */
        public final j.a f11519d = new j.a();

        public a(Context context) {
            this.f11516a = context.getApplicationContext();
        }

        public final t a() {
            j.a aVar = this.f11519d;
            aVar.getClass();
            j jVar = new j(b8.c.b(aVar.f11511a));
            f.b bVar = this.f11517b;
            f.b bVar2 = new f.b(bVar.f31364a, bVar.f31365b, bVar.f31366c, bVar.f31367d, bVar.f31368e, bVar.f31369f, bVar.f31370g, bVar.f31371h, bVar.f31372i, bVar.f31373j, bVar.f31374k, bVar.f31375l, bVar.f31376m, jVar);
            pg.s sVarB = w0.b(new n(this, 0));
            pg.s sVarB2 = w0.b(new o());
            f fVar = this.f11518c;
            if (fVar == null) {
                fVar = new f();
            }
            return new t(new t.a(this.f11516a, bVar2, sVarB, sVarB2, fVar));
        }
    }

    Object a(w7.f fVar, vg.c cVar);
}
