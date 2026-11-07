package l9;

import android.util.Log;
import com.basitce.htmltoapk.MainActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import n8.i1;
import n8.m1;
import n8.w0;

@vg.e(c = "com.basitce.htmltoapk.util.AppUpdateHelper$checkAndPromptUpdate$2", f = "AppUpdateHelper.kt", l = {62, 63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f16839a;

    /* renamed from: b, reason: collision with root package name */
    public int f16840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f16841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cc.b f16842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16843e;

    @vg.e(c = "com.basitce.htmltoapk.util.AppUpdateHelper$checkAndPromptUpdate$2$1$1", f = "AppUpdateHelper.kt", l = {78}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16844a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m1 f16845b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f16846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, int i10, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f16845b = m1Var;
            this.f16846c = i10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f16845b, this.f16846c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ug.a.f29706a;
            int i10 = this.f16844a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f16844a = 1;
                Object objA = v4.g.a(this.f16845b.f18526b, new n8.r0(this.f16846c, null), this);
                if (objA != obj2) {
                    objA = pg.f0.f21461a;
                }
                if (objA == obj2) {
                    return obj2;
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
    public j(m1 m1Var, cc.b bVar, MainActivity mainActivity, tg.e eVar) {
        super(2, eVar);
        this.f16841c = m1Var;
        this.f16842d = bVar;
        this.f16843e = mainActivity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new j(this.f16841c, this.f16842d, this.f16843e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((j) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        int iIntValue;
        cc.b bVar = this.f16842d;
        ug.a aVar = ug.a.f29706a;
        int i11 = this.f16840b;
        m1 m1Var = this.f16841c;
        try {
        } catch (Exception e10) {
            Log.e("AppUpdateHelper", "Error checking for in-app update", e10);
        }
        if (i11 == 0) {
            pg.q.b(obj);
            i1 i1Var = m1Var.f18532h;
            this.f16840b = 1;
            obj = gg.a.f(i1Var, this);
            if (obj == aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f16839a;
            pg.q.b(obj);
            iIntValue = ((Number) obj).intValue();
            if ((iIntValue != 0 && i10 >= 1) || i10 - iIntValue >= 10) {
                Task<cc.a> taskB = bVar.b();
                kotlin.jvm.internal.r.d(taskB, "getAppUpdateInfo(...)");
                final g gVar = new g(bVar, this.f16843e, m1Var, i10);
                taskB.addOnSuccessListener(new OnSuccessListener() { // from class: l9.h
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj2) {
                        gVar.invoke(obj2);
                    }
                }).addOnFailureListener(new i());
                return pg.f0.f21461a;
            }
        }
        pg.q.b(obj);
        int iIntValue2 = ((Number) obj).intValue();
        w0 w0Var = m1Var.f18538n;
        this.f16839a = iIntValue2;
        this.f16840b = 2;
        Object objF = gg.a.f(w0Var, this);
        if (objF != aVar) {
            i10 = iIntValue2;
            obj = objF;
            iIntValue = ((Number) obj).intValue();
            return iIntValue != 0 ? pg.f0.f21461a : pg.f0.f21461a;
            return pg.f0.f21461a;
        }
        return aVar;
    }
}
