package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f26573a = new f1.b(-932273607, false, a.f26575a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f26574b = new f1.b(-711844679, false, b.f26576a);

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26575a = new a(2);

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar2, 0, 7);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26576a = new b(2);

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar2, 0, 7);
            }
            return pg.f0.f21461a;
        }
    }
}
