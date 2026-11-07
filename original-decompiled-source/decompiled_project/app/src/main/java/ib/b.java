package ib;

import ae.l;
import ae.m;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import pa.f;
import pa.g;

/* loaded from: classes2.dex */
public final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14440a;

    public b(Context context, l lVar) {
        this.f14440a = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            a.a(this.f14440a);
            return 0;
        } catch (f e10) {
            return Integer.valueOf(e10.f21390a);
        } catch (g e11) {
            return Integer.valueOf(e11.f21391a);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            m.f473i.setResult(null);
            return;
        }
        a.f14436a.a(this.f14440a, "pi", num.intValue());
        Log.d("FirebaseFunctions", "Failed to update ssl context");
        m.f473i.setResult(null);
    }
}
