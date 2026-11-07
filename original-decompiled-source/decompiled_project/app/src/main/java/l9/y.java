package l9;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements OnCompleteListener {
    public static void a(w1.e eVar, float f10, float f11, float f12, float f13) {
        eVar.a();
        eVar.h(f10, f11);
        eVar.g(f12, f13);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it) {
        kotlin.jvm.internal.r.e(it, "it");
        Log.d("InAppReviewHelper", "Google Play in-app review flow completed");
    }
}
