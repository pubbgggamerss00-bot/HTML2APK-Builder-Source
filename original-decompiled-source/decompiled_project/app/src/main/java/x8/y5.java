package x8;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$SideloadWarningBanner$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y5 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f33395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f33397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(boolean z10, eh.a<pg.f0> aVar, Context context, tg.e<? super y5> eVar) {
        super(2, eVar);
        this.f33395a = z10;
        this.f33396b = aVar;
        this.f33397c = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y5(this.f33395a, this.f33396b, this.f33397c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y5) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Vibrator defaultVibrator;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        if (!this.f33395a) {
            return pg.f0.f21461a;
        }
        this.f33396b.invoke();
        try {
            int i10 = Build.VERSION.SDK_INT;
            Context context = this.f33397c;
            if (i10 >= 31) {
                Object systemService = context.getSystemService("vibrator_manager");
                VibratorManager vibratorManagerA = v5.a(systemService) ? w5.a(systemService) : null;
                if (vibratorManagerA != null && (defaultVibrator = vibratorManagerA.getDefaultVibrator()) != null) {
                    defaultVibrator.vibrate(VibrationEffect.createOneShot(180L, -1));
                }
            } else {
                Object systemService2 = context.getSystemService("vibrator");
                Vibrator vibrator = systemService2 instanceof Vibrator ? (Vibrator) systemService2 : null;
                if (vibrator != null) {
                    vibrator.vibrate(180L);
                }
            }
        } catch (Exception unused) {
        }
        return pg.f0.f21461a;
    }
}
