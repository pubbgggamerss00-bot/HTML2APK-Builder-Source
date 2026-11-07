package p9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p9.c;
import q9.f;
import q9.g;
import q9.h;
import q9.i;
import q9.j;
import q9.k;
import q9.n;
import q9.o;
import q9.p;
import q9.q;
import q9.r;
import q9.s;
import q9.t;
import r9.h;
import r9.m;
import s9.f;
import s9.l;
import xd.e;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final xd.d f21362a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f21363b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f21364c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f21365d;

    /* renamed from: e, reason: collision with root package name */
    public final aa.a f21366e;

    /* renamed from: f, reason: collision with root package name */
    public final aa.a f21367f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21368g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f21369a;

        /* renamed from: b, reason: collision with root package name */
        public final i f21370b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21371c;

        public a(URL url, i iVar, String str) {
            this.f21369a = url;
            this.f21370b = iVar;
            this.f21371c = str;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f21372a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f21373b;

        /* renamed from: c, reason: collision with root package name */
        public final long f21374c;

        public b(int i10, URL url, long j10) {
            this.f21372a = i10;
            this.f21373b = url;
            this.f21374c = j10;
        }
    }

    public c(Context context, aa.a aVar, aa.a aVar2) {
        e eVar = new e();
        q9.c cVar = q9.c.f22523a;
        eVar.a(o.class, cVar);
        eVar.a(i.class, cVar);
        f fVar = f.f22536a;
        eVar.a(r.class, fVar);
        eVar.a(q9.l.class, fVar);
        q9.d dVar = q9.d.f22525a;
        eVar.a(p.class, dVar);
        eVar.a(j.class, dVar);
        q9.b bVar = q9.b.f22510a;
        eVar.a(q9.a.class, bVar);
        eVar.a(h.class, bVar);
        q9.e eVar2 = q9.e.f22528a;
        eVar.a(q.class, eVar2);
        eVar.a(k.class, eVar2);
        g gVar = g.f22544a;
        eVar.a(s.class, gVar);
        eVar.a(n.class, gVar);
        eVar.f33553d = true;
        this.f21362a = new xd.d(eVar);
        this.f21364c = context;
        this.f21363b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f21365d = c(p9.a.f21356c);
        this.f21366e = aVar2;
        this.f21367f = aVar;
        this.f21368g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(m3.a.a("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [p9.b] */
    @Override // s9.l
    public final s9.b a(s9.a aVar) {
        String str;
        b bVarA;
        Integer numValueOf;
        String str2;
        k.a aVar2;
        f.a aVar3 = f.a.f24777b;
        HashMap map = new HashMap();
        ArrayList arrayList = aVar.f24768a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            r9.n nVar = (r9.n) obj;
            String strG = nVar.g();
            if (map.containsKey(strG)) {
                ((List) map.get(strG)).add(nVar);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(nVar);
                map.put(strG, arrayList2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r9.n nVar2 = (r9.n) ((List) entry.getValue()).get(i10);
            t tVar = t.f22592a;
            long jA = this.f21367f.a();
            long jA2 = this.f21366e.a();
            j jVar = new j(new h(Integer.valueOf(nVar2.f("sdk-version")), nVar2.a("model"), nVar2.a("hardware"), nVar2.a("device"), nVar2.a("product"), nVar2.a("os-uild"), nVar2.a("manufacturer"), nVar2.a("fingerprint"), nVar2.a("locale"), nVar2.a("country"), nVar2.a("mcc_mnc"), nVar2.a("application_build")));
            try {
                str2 = null;
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList4 = new ArrayList();
            for (r9.n nVar3 : (List) entry.getValue()) {
                m mVarD = nVar3.d();
                o9.b bVar = mVarD.f23302a;
                byte[] bArr = mVarD.f23303b;
                Iterator it2 = it;
                if (bVar.equals(new o9.b("proto"))) {
                    aVar2 = new k.a();
                    aVar2.f22572d = bArr;
                } else if (bVar.equals(new o9.b("json"))) {
                    String str3 = new String(bArr, Charset.forName("UTF-8"));
                    k.a aVar4 = new k.a();
                    aVar4.f22573e = str3;
                    aVar2 = aVar4;
                } else {
                    String strConcat = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat, 5)) {
                        Log.w(strConcat, "Received event of unsupported encoding " + bVar + ". Skipping...");
                    }
                    it = it2;
                }
                aVar2.f22569a = Long.valueOf(nVar3.e());
                aVar2.f22571c = Long.valueOf(nVar3.h());
                String str4 = nVar3.b().get("tz-offset");
                aVar2.f22574f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar2.f22575g = new n(s.b.f22590a.get(nVar3.f("net-type")), s.a.f22588a.get(nVar3.f("mobile-subtype")));
                if (nVar3.c() != null) {
                    aVar2.f22570b = nVar3.c();
                }
                String strA = aVar2.f22569a == null ? " eventTimeMs" : "";
                if (aVar2.f22571c == null) {
                    strA = strA.concat(" eventUptimeMs");
                }
                if (aVar2.f22574f == null) {
                    strA = k3.a.a(strA, " timezoneOffsetSeconds");
                }
                if (!strA.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strA));
                }
                arrayList4.add(new k(aVar2.f22569a.longValue(), aVar2.f22570b, aVar2.f22571c.longValue(), aVar2.f22572d, aVar2.f22573e, aVar2.f22574f.longValue(), aVar2.f22575g));
                it = it2;
            }
            arrayList3.add(new q9.l(jA, jA2, jVar, numValueOf, str2, arrayList4));
            i10 = 0;
        }
        int i12 = 5;
        i iVar = new i(arrayList3);
        byte[] bArr2 = aVar.f24769b;
        f.a aVar5 = f.a.f24778c;
        URL urlC = this.f21365d;
        if (bArr2 != null) {
            try {
                p9.a aVarB = p9.a.b(bArr2);
                str = aVarB.f21360b;
                if (str == null) {
                    str = null;
                }
                String str5 = aVarB.f21359a;
                if (str5 != null) {
                    urlC = c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return new s9.b(aVar5, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar6 = new a(urlC, iVar, str);
            ?? r32 = new Object() { // from class: p9.b
                public final c.b a(c.a aVar7) {
                    URL url = aVar7.f21369a;
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Making request to: %s", url));
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    c cVar = this.f21361a;
                    httpURLConnection.setReadTimeout(cVar.f21368g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    String str6 = aVar7.f21371c;
                    if (str6 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", str6);
                    }
                    try {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                xd.d dVar = cVar.f21362a;
                                i iVar2 = aVar7.f21370b;
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                                e eVar = dVar.f33545a;
                                xd.f fVar = new xd.f(bufferedWriter, eVar.f33550a, eVar.f33551b, eVar.f33552c, eVar.f33553d);
                                fVar.d(iVar2);
                                fVar.f();
                                fVar.f33556b.flush();
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Integer numValueOf2 = Integer.valueOf(responseCode);
                                String strConcat3 = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat3, 4)) {
                                    Log.i(strConcat3, String.format("Status Code: %d", numValueOf2));
                                }
                                v9.a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                                v9.a.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                    return new c.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
                                if (responseCode != 200) {
                                    return new c.b(responseCode, null, 0L);
                                }
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        c.b bVar2 = new c.b(responseCode, null, q9.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f22583a);
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return bVar2;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } catch (ConnectException e10) {
                        e = e10;
                        v9.a.b(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
                        return new c.b(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, null, 0L);
                    } catch (UnknownHostException e11) {
                        e = e11;
                        v9.a.b(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
                        return new c.b(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, null, 0L);
                    } catch (IOException e12) {
                        e = e12;
                        v9.a.b(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
                        return new c.b(400, null, 0L);
                    } catch (vd.b e13) {
                        e = e13;
                        v9.a.b(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
                        return new c.b(400, null, 0L);
                    }
                }
            };
            do {
                bVarA = r32.a(aVar6);
                URL url = bVarA.f21373b;
                if (url != null) {
                    v9.a.a(url, "CctTransportBackend", "Following redirect to: %s");
                    aVar6 = new a(url, aVar6.f21370b, aVar6.f21371c);
                } else {
                    aVar6 = null;
                }
                if (aVar6 == null) {
                    break;
                }
                i12--;
            } while (i12 >= 1);
            int i13 = bVarA.f21372a;
            if (i13 == 200) {
                return new s9.b(f.a.f24776a, bVarA.f21374c);
            }
            if (i13 < 500 && i13 != 404) {
                return i13 == 400 ? new s9.b(f.a.f24779d, -1L) : new s9.b(aVar5, -1L);
            }
            return new s9.b(aVar3, -1L);
        } catch (IOException e10) {
            v9.a.b(e10, "CctTransportBackend", "Could not make request to the backend");
            return new s9.b(aVar3, -1L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    @Override // s9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r9.h b(r9.h hVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f21363b.getActiveNetworkInfo();
        h.a aVarI = hVar.i();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map2 = aVarI.f23285f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        aVarI.a("model", Build.MODEL);
        aVarI.a("hardware", Build.HARDWARE);
        aVarI.a("device", Build.DEVICE);
        aVarI.a("product", Build.PRODUCT);
        aVarI.a("os-uild", Build.ID);
        aVarI.a("manufacturer", Build.MANUFACTURER);
        aVarI.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / DescriptorProtos.Edition.EDITION_2023_VALUE;
        HashMap map3 = aVarI.f23285f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray<s.b> sparseArray = s.b.f22590a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = aVarI.f23285f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray<s.a> sparseArray2 = s.a.f22588a;
                subtype = 100;
            } else if (s.a.f22588a.get(subtype) == null) {
            }
            map = aVarI.f23285f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            aVarI.a("country", Locale.getDefault().getCountry());
            aVarI.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f21364c;
            aVarI.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                v9.a.b(e10, "CctTransportBackend", "Unable to find version code for package");
            }
            aVarI.a("application_build", Integer.toString(i11));
            return aVarI.b();
        }
        SparseArray<s.a> sparseArray3 = s.a.f22588a;
        subtype = 0;
        map = aVarI.f23285f;
        if (map != null) {
        }
    }
}
