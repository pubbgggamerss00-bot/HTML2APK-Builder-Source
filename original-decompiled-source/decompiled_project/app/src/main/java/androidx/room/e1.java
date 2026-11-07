package androidx.room;

import android.database.SQLException;
import androidx.room.t0;
import java.util.Set;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {413, 420}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e1 extends vg.i implements eh.p<t0, tg.e<? super Set<? extends Integer>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f2905a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2907c;

    @vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {421}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<s0<Set<? extends Integer>>, tg.e<? super Set<? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f2908a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2909b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1 f2910c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1 a1Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f2910c = a1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f2910c, eVar);
            aVar.f2909b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(s0<Set<? extends Integer>> s0Var, tg.e<? super Set<? extends Integer>> eVar) {
            return ((a) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f2908a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            s0 s0Var = (s0) this.f2909b;
            this.f2908a = 1;
            Object objA = a1.a(this.f2910c, s0Var, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(a1 a1Var, tg.e<? super e1> eVar) {
        super(2, eVar);
        this.f2907c = a1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        e1 e1Var = new e1(this.f2907c, eVar);
        e1Var.f2906b = obj;
        return e1Var;
    }

    @Override // eh.p
    public final Object invoke(t0 t0Var, tg.e<? super Set<? extends Integer>> eVar) {
        return ((e1) create(t0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f2905a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                t0Var = (t0) this.f2906b;
                this.f2906b = t0Var;
                this.f2905a = 1;
                obj = t0Var.b(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return (Set) obj;
            }
            t0Var = (t0) this.f2906b;
            pg.q.b(obj);
            if (!((Boolean) obj).booleanValue()) {
                t0.a aVar2 = t0.a.f3089b;
                a aVar3 = new a(this.f2907c, null);
                this.f2906b = null;
                this.f2905a = 2;
                obj = t0Var.c(aVar2, aVar3, this);
            }
        } catch (SQLException unused) {
        }
        return qg.b0.f22711a;
    }
}
