package ae;

import ae.n;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import org.json.JSONException;
import org.json.JSONObject;
import pg.f0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: i, reason: collision with root package name */
    public static final TaskCompletionSource<Void> f473i = new TaskCompletionSource<>();

    /* renamed from: j, reason: collision with root package name */
    public static boolean f474j;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f475a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f476b;

    /* renamed from: c, reason: collision with root package name */
    public final y f477c;

    /* renamed from: d, reason: collision with root package name */
    public final ae.a f478d;

    /* renamed from: e, reason: collision with root package name */
    public final String f479e;

    /* renamed from: f, reason: collision with root package name */
    public final String f480f;

    /* renamed from: g, reason: collision with root package name */
    public final String f481g;

    /* renamed from: h, reason: collision with root package name */
    public final String f482h;

    public final class a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource<x> f483a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f484b;

        public a(TaskCompletionSource<x> taskCompletionSource, m mVar) {
            this.f483a = taskCompletionSource;
            this.f484b = mVar;
        }

        @Override // okhttp3.Callback
        public final void a(Call call, Response response) throws JSONException, IOException {
            n.a aVarValueOf;
            Charset charsetA;
            Object objOpt;
            y serializer = this.f484b.f477c;
            n.a aVar = n.a.f488a;
            int i10 = response.f19356d;
            if (i10 == 200) {
                aVarValueOf = n.a.f488a;
            } else if (i10 == 409) {
                aVarValueOf = n.a.f496j;
            } else if (i10 == 429) {
                aVarValueOf = n.a.f495h;
            } else if (i10 == 400) {
                aVarValueOf = n.a.f491d;
            } else if (i10 == 401) {
                aVarValueOf = n.a.f500n;
            } else if (i10 == 403) {
                aVarValueOf = n.a.f494g;
            } else if (i10 == 404) {
                aVarValueOf = n.a.f493f;
            } else if (i10 == 503) {
                aVarValueOf = n.a.f499m;
            } else if (i10 != 504) {
                switch (i10) {
                    case 499:
                        aVarValueOf = n.a.f489b;
                        break;
                    case CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION /* 500 */:
                        aVarValueOf = n.a.f498l;
                        break;
                    case 501:
                        aVarValueOf = n.a.f497k;
                        break;
                    default:
                        aVarValueOf = n.a.f490c;
                        break;
                }
            } else {
                aVarValueOf = n.a.f492e;
            }
            ResponseBody responseBody = response.f19359g;
            kotlin.jvm.internal.r.b(responseBody);
            hi.i iVarS0 = responseBody.s0();
            try {
                MediaType mediaTypeL = responseBody.l();
                if (mediaTypeL == null || (charsetA = mediaTypeL.a(mh.a.f18238b)) == null) {
                    charsetA = mh.a.f18238b;
                }
                String strS = iVarS0.S(Util.r(iVarS0, charsetA));
                iVarS0.close();
                int i11 = n.f485c;
                kotlin.jvm.internal.r.e(serializer, "serializer");
                String strName = aVarValueOf.name();
                try {
                    JSONObject jSONObject = new JSONObject(strS).getJSONObject("error");
                    if (jSONObject.opt("status") instanceof String) {
                        String string = jSONObject.getString("status");
                        kotlin.jvm.internal.r.d(string, "error.getString(\"status\")");
                        aVarValueOf = n.a.valueOf(string);
                        strName = aVarValueOf.name();
                    }
                    if (jSONObject.opt("message") instanceof String) {
                        String string2 = jSONObject.getString("message");
                        kotlin.jvm.internal.r.d(string2, "error.getString(\"message\")");
                        if (string2.length() > 0) {
                            String string3 = jSONObject.getString("message");
                            kotlin.jvm.internal.r.d(string3, "error.getString(\"message\")");
                            strName = string3;
                        }
                    }
                    objOpt = jSONObject.opt("details");
                    if (objOpt != null) {
                        try {
                            objOpt = y.a(objOpt);
                        } catch (IllegalArgumentException unused) {
                            aVarValueOf = n.a.f498l;
                            strName = "INTERNAL";
                        } catch (JSONException unused2) {
                        }
                    }
                } catch (IllegalArgumentException unused3) {
                    objOpt = null;
                } catch (JSONException unused4) {
                    objOpt = null;
                }
                n nVar = aVarValueOf == n.a.f488a ? null : new n(strName, aVarValueOf, objOpt);
                TaskCompletionSource<x> taskCompletionSource = this.f483a;
                if (nVar != null) {
                    taskCompletionSource.setException(nVar);
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(strS);
                    Object objOpt2 = jSONObject2.opt("data");
                    if (objOpt2 == null) {
                        objOpt2 = jSONObject2.opt("result");
                    }
                    if (objOpt2 == null) {
                        taskCompletionSource.setException(new n("Response is missing data field.", n.a.f498l, (Object) null));
                    } else {
                        serializer.getClass();
                        taskCompletionSource.setResult(new x(y.a(objOpt2)));
                    }
                } catch (JSONException e10) {
                    taskCompletionSource.setException(new n("Response is not valid JSON object.", n.a.f498l, (Exception) e10));
                }
            } finally {
            }
        }

        @Override // okhttp3.Callback
        public final void c(Call call, IOException iOException) {
            boolean z10 = iOException instanceof InterruptedIOException;
            TaskCompletionSource<x> taskCompletionSource = this.f483a;
            if (z10) {
                taskCompletionSource.setException(new n("DEADLINE_EXCEEDED", n.a.f492e, (Exception) iOException));
            } else {
                taskCompletionSource.setException(new n("INTERNAL", n.a.f498l, (Exception) iOException));
            }
        }
    }

    public m(final Context context, String str, ae.a aVar, @jd.c Executor executor, @jd.d Executor uiExecutor) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(executor, "executor");
        kotlin.jvm.internal.r.e(uiExecutor, "uiExecutor");
        this.f475a = executor;
        this.f476b = new OkHttpClient();
        y yVar = new y();
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f477c = yVar;
        com.google.android.gms.common.internal.p.f(aVar);
        this.f478d = aVar;
        com.google.android.gms.common.internal.p.f(str);
        this.f479e = str;
        this.f482h = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
        try {
            new URL("europe-west1");
            this.f480f = "us-central1";
            this.f481g = "europe-west1";
        } catch (MalformedURLException unused) {
            this.f480f = "europe-west1";
            this.f481g = null;
        }
        synchronized (f473i) {
            if (f474j) {
                return;
            }
            f474j = true;
            f0 f0Var = f0.f21461a;
            uiExecutor.execute(new Runnable() { // from class: ae.k
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    kotlin.jvm.internal.r.e(context2, "$context");
                    l lVar = new l();
                    pa.e eVar = ib.a.f14436a;
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        throw new IllegalStateException("Must be called on the UI thread");
                    }
                    new ib.b(context2, lVar).execute(new Void[0]);
                }
            });
        }
    }

    public final w a(String str) {
        u uVar = new u();
        uVar.f515a = u.f514b;
        return new w(this, str, uVar);
    }
}
