package ae;

import ae.m;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final m f519a;

    /* renamed from: b, reason: collision with root package name */
    public final String f520b;

    /* renamed from: c, reason: collision with root package name */
    public final u f521c;

    public w(m mVar, String str, u uVar) {
        this.f519a = mVar;
        this.f520b = str;
        this.f521c = uVar;
    }

    public final Task a(final Map map) {
        Task<Void> task = m.f473i.getTask();
        final m mVar = this.f519a;
        Executor executor = mVar.f475a;
        final u uVar = this.f521c;
        Task<TContinuationResult> taskContinueWithTask = task.continueWithTask(executor, new Continuation(uVar) { // from class: ae.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task it) {
                kotlin.jvm.internal.r.e(it, "it");
                return this.f467a.f478d.getContext();
            }
        });
        final String str = this.f520b;
        Task taskContinueWithTask2 = taskContinueWithTask.continueWithTask(executor, new Continuation() { // from class: ae.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                MediaType mediaTypeA;
                m this$0 = mVar;
                kotlin.jvm.internal.r.e(this$0, "this$0");
                String name = str;
                kotlin.jvm.internal.r.e(name, "$name");
                u options = uVar;
                kotlin.jvm.internal.r.e(options, "$options");
                kotlin.jvm.internal.r.e(task2, "task");
                if (!task2.isSuccessful()) {
                    Exception exception = task2.getException();
                    kotlin.jvm.internal.r.b(exception);
                    return Tasks.forException(exception);
                }
                v vVar = (v) task2.getResult();
                String str2 = String.format(this$0.f482h, Arrays.copyOf(new Object[]{this$0.f480f, this$0.f479e, name}, 3));
                String str3 = this$0.f481g;
                if (str3 != null) {
                    str2 = str3 + '/' + name;
                }
                try {
                    URL url = new URL(str2);
                    this$0.getClass();
                    com.google.android.gms.common.internal.p.g(url, "url cannot be null");
                    HashMap map2 = new HashMap();
                    this$0.f477c.getClass();
                    map2.put("data", y.b(map));
                    JSONObject jSONObject = new JSONObject(map2);
                    MediaType.f19273c.getClass();
                    MediaType mediaTypeA2 = null;
                    try {
                        mediaTypeA = MediaType.Companion.a("application/json");
                    } catch (IllegalArgumentException unused) {
                        mediaTypeA = null;
                    }
                    String content = jSONObject.toString();
                    RequestBody.f19348a.getClass();
                    kotlin.jvm.internal.r.e(content, "content");
                    Charset charset = mh.a.f18238b;
                    if (mediaTypeA != null) {
                        Charset charsetA = mediaTypeA.a(null);
                        if (charsetA == null) {
                            String str4 = mediaTypeA + "; charset=utf-8";
                            kotlin.jvm.internal.r.e(str4, "<this>");
                            try {
                                mediaTypeA2 = MediaType.Companion.a(str4);
                            } catch (IllegalArgumentException unused2) {
                            }
                            mediaTypeA = mediaTypeA2;
                        } else {
                            charset = charsetA;
                        }
                    }
                    byte[] bytes = content.getBytes(charset);
                    kotlin.jvm.internal.r.d(bytes, "this as java.lang.String).getBytes(charset)");
                    int length = bytes.length;
                    long length2 = bytes.length;
                    long j10 = 0;
                    long j11 = length;
                    byte[] bArr = Util.f19393a;
                    if ((j10 | j11) < 0 || j10 > length2 || length2 - j10 < j11) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2 = new RequestBody$Companion$toRequestBody$2(mediaTypeA, length, bytes);
                    Request.Builder builder = new Request.Builder();
                    HttpUrl.Companion companion = HttpUrl.f19253j;
                    String string = url.toString();
                    kotlin.jvm.internal.r.d(string, "url.toString()");
                    companion.getClass();
                    builder.f19343a = HttpUrl.Companion.c(string);
                    builder.c("POST", requestBody$Companion$toRequestBody$2);
                    kotlin.jvm.internal.r.b(vVar);
                    String str5 = vVar.f516a;
                    if (str5 != null) {
                        builder.b("Authorization", "Bearer ".concat(str5));
                    }
                    String str6 = vVar.f517b;
                    if (str6 != null) {
                        builder.b("Firebase-Instance-ID-Token", str6);
                    }
                    String str7 = vVar.f518c;
                    if (str7 != null) {
                        builder.b("X-Firebase-AppCheck", str7);
                    }
                    OkHttpClient client = this$0.f476b;
                    kotlin.jvm.internal.r.e(client, "client");
                    OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                    builder2.f19302a = client.f19279a;
                    builder2.f19303b = client.f19280b;
                    qg.t.p(client.f19281c, builder2.f19304c);
                    qg.t.p(client.f19282d, builder2.f19305d);
                    builder2.f19306e = client.f19283e;
                    builder2.f19307f = client.f19284f;
                    builder2.f19308g = client.f19285g;
                    builder2.f19309h = client.f19286h;
                    builder2.f19310i = client.f19287j;
                    builder2.f19311j = client.f19288k;
                    builder2.f19312k = client.f19289l;
                    builder2.f19313l = client.f19290m;
                    builder2.f19314m = client.f19291n;
                    builder2.f19315n = client.f19292p;
                    builder2.f19316o = client.f19293q;
                    builder2.f19317p = client.f19294r;
                    builder2.f19318q = client.f19295s;
                    builder2.f19319r = client.f19296t;
                    builder2.f19320s = client.f19297v;
                    builder2.f19321t = client.f19298w;
                    builder2.f19322u = client.f19299x;
                    builder2.f19323v = client.f19300y;
                    builder2.f19324w = client.f19301z;
                    builder2.f19325x = client.A;
                    builder2.f19326y = client.B;
                    builder2.f19327z = client.C;
                    builder2.A = client.D;
                    TimeUnit unit = options.f515a;
                    kotlin.jvm.internal.r.e(unit, "unit");
                    builder2.f19323v = Util.b(unit);
                    builder2.f19325x = Util.b(unit);
                    RealCall realCallA = new OkHttpClient(builder2).a(builder.a());
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    realCallA.d(new m.a(taskCompletionSource, this$0));
                    Task task3 = taskCompletionSource.getTask();
                    kotlin.jvm.internal.r.d(task3, "tcs.task");
                    return task3;
                } catch (MalformedURLException e10) {
                    throw new IllegalStateException(e10);
                }
            }
        });
        kotlin.jvm.internal.r.d(taskContinueWithTask2, "providerInstalled.task\n …context, options)\n      }");
        return taskContinueWithTask2;
    }
}
