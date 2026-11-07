package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.mx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11662a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f11663b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11664c;

    /* renamed from: d, reason: collision with root package name */
    public final j f11665d;

    /* renamed from: e, reason: collision with root package name */
    public final r f11666e;

    /* renamed from: f, reason: collision with root package name */
    public final j5 f11667f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.g f11668g;
    public final b1 h;

    /* renamed from: i, reason: collision with root package name */
    public final g0 f11669i;

    public c9(Application application, Handler handler, Executor executor, j jVar, r rVar, j5 j5Var, p2.g gVar, b1 b1Var, g0 g0Var) {
        this.f11662a = application;
        this.f11663b = handler;
        this.f11664c = executor;
        this.f11665d = jVar;
        this.f11666e = rVar;
        this.f11667f = j5Var;
        this.f11668g = gVar;
        this.h = b1Var;
        this.f11669i = g0Var;
    }

    public final e0 a(c0 c0Var) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f11662a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = c0Var.f11649a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    com.google.android.gms.internal.ads.m2 m2Var = c0Var.f11650b;
                    if (m2Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i6 = m2Var.s;
                        if (i6 != 1) {
                            jsonWriter.name("os_type");
                            int i7 = i6 - 1;
                            if (i7 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i7 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) m2Var.f6905t;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) m2Var.f6906u;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = c0Var.f11651c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = c0Var.f11652d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = c0Var.f11653e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    mx mxVar = c0Var.f11654f;
                    if (mxVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) mxVar.f7232t;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) mxVar.f7233u;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d7 = (Double) mxVar.f7234v;
                        if (d7 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d7);
                        }
                        List<b0> list = (List) mxVar.f7235w;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (b0 b0Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = b0Var.f11639a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = b0Var.f11640b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = b0Var.f11641c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = b0Var.f11642d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    k00 k00Var = c0Var.f11655g;
                    if (k00Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) k00Var.s;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) k00Var.f6201t;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) k00Var.f6202u;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (c0Var.h != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = c0Var.f11656i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((a0) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        e0 e0VarA = e0.a(new JsonReader(new StringReader(headerField)));
                        e0VarA.f11702a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return e0VarA;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            e0 e0VarA2 = e0.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return e0VarA2;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (SocketTimeoutException e6) {
            throw new f2(4, "The server timed out.", e6);
        } catch (IOException e7) {
            throw new f2(2, "Error making request.", e7);
        }
    }
}
