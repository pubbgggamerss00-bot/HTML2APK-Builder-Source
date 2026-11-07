package l8;

import ah.l;
import ah.p;
import android.content.Context;
import androidx.datastore.preferences.protobuf.h;
import b.o;
import com.basitce.htmltoapk.data.apkgenerator.IconGenerator;
import com.basitce.htmltoapk.data.apkgenerator.ProjectAssetWriter;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.AndroidManifestAttrs;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jh.f;
import jh.g;
import kotlin.jvm.internal.r;
import lh.e;
import lh.j;
import mh.k;
import mh.t;
import mh.x;
import org.json.JSONArray;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import pg.f0;
import pg.n;
import pg.q;
import qg.j0;
import qg.k0;
import qg.n0;
import qg.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16765a;

    public b(Context context) {
        r.e(context, "context");
        this.f16765a = context;
    }

    public static String a(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            str = t.n(str, "{{" + str2 + "}}", (String) entry.getValue());
        }
        return str;
    }

    public static Map b(ProjectEntity projectEntity) {
        n nVar = new n("packageName", projectEntity.getPackageName());
        n nVar2 = new n("appName", projectEntity.getAppName());
        n nVar3 = new n("versionCode", String.valueOf(projectEntity.getVersionCode()));
        n nVar4 = new n("versionName", projectEntity.getVersionName());
        n nVar5 = new n("minSdk", String.valueOf(projectEntity.getMinSdk()));
        n nVar6 = new n("targetSdk", String.valueOf(projectEntity.getTargetSdk()));
        n nVar7 = new n("compileSdk", String.valueOf(projectEntity.getTargetSdk()));
        n nVar8 = new n("mainActivity", "MainActivity");
        String input = projectEntity.getName();
        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
        r.d(patternCompile, "compile(...)");
        r.e(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
        r.d(strReplaceAll, "replaceAll(...)");
        return k0.d(nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, new n("projectName", strReplaceAll));
    }

    public static void h(File file, File file2) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
        try {
            e.a aVar = new e.a(j.i(l.p(file), new a(0)));
            while (aVar.hasNext()) {
                File file3 = (File) aVar.next();
                zipOutputStream.putNextEntry(new ZipEntry(l.h(l.l(file3, file))));
                FileInputStream fileInputStream = new FileInputStream(file3);
                try {
                    ah.b.a(fileInputStream, zipOutputStream, 8192);
                    fileInputStream.close();
                    zipOutputStream.closeEntry();
                } finally {
                }
            }
            f0 f0Var = f0.f21461a;
            zipOutputStream.close();
        } finally {
        }
    }

    public final void c(File file, String str) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        InputStream inputStreamOpen = this.f16765a.getAssets().open(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                r.b(inputStreamOpen);
                ah.b.a(inputStreamOpen, fileOutputStream, 8192);
                fileOutputStream.close();
                inputStreamOpen.close();
            } finally {
            }
        } finally {
        }
    }

    public final void d(String str, File file, Map<String, String> map) throws IOException {
        String[] list = this.f16765a.getAssets().list(str);
        if (list == null) {
            return;
        }
        if (list.length != 0) {
            for (String str2 : list) {
                d(k3.b.a(str, "/", str2), new File(file, str2), map);
            }
            return;
        }
        if (t.i(str, ".xml", false) || t.i(str, ".kt", false) || t.i(str, ".kts", false) || t.i(str, ".json", false) || t.i(str, ".properties", false) || t.i(str, ".gradle", false)) {
            e(str, file, map);
        } else {
            c(file, str);
        }
    }

    public final void e(String str, File file, Map<String, String> map) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        InputStream inputStreamOpen = this.f16765a.getAssets().open(str);
        r.d(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, mh.a.f18238b), 8192);
        try {
            String strD = p.d(bufferedReader);
            bufferedReader.close();
            if (t.i(str, ".xml", false)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(j0.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), t.n(t.n(t.n(t.n((String) entry.getValue(), "&", "&amp;"), "<", "&lt;"), "\"", "&quot;"), "'", "\\'"));
                }
                map = linkedHashMap;
            }
            l.r(file, a(strD, map), mh.a.f18238b);
        } finally {
        }
    }

    public final Serializable f(ProjectEntity projectEntity, File file, boolean z10) {
        try {
            file.mkdirs();
            String input = projectEntity.getName();
            Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
            r.d(patternCompile, "compile(...)");
            r.e(input, "input");
            String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
            r.d(strReplaceAll, "replaceAll(...)");
            File file2 = new File(file, strReplaceAll);
            l.f(file2);
            file2.mkdirs();
            g(projectEntity, file2, strReplaceAll, z10);
            return file2;
        } catch (Exception e10) {
            return q.a(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e2  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(ProjectEntity projectEntity, File file, String str, boolean z10) throws TransformerException, SAXException, DOMException, IOException {
        ?? arrayList;
        Collection collectionJ;
        int i10;
        File file2;
        String string;
        String strB;
        Map<String, String> mapG = k0.g(b(projectEntity), new n("projectName", str));
        e("android_project_template_root/build.gradle.kts", new File(file, "build.gradle.kts"), mapG);
        e("android_project_template_root/settings.gradle.kts", new File(file, "settings.gradle.kts"), mapG);
        e("android_project_template_root/gradle.properties", new File(file, "gradle.properties"), mapG);
        e("android_project_template_root/gradle/wrapper/gradle-wrapper.properties", new File(file, "gradle/wrapper/gradle-wrapper.properties"), mapG);
        c(new File(file, "gradle/wrapper/gradle-wrapper.jar"), "android_project_template_root/gradle/wrapper/gradle-wrapper.jar");
        String str2 = "";
        String str3 = projectEntity.getAdmobEnabled() ? "implementation(\"com.google.android.gms:play-services-ads:23.6.0\")\nimplementation(\"com.google.android.ump:user-messaging-platform:4.0.0\")" : "";
        Integer maxSdk = projectEntity.getMaxSdk();
        if (maxSdk != null && (strB = ad.b.b(maxSdk.intValue(), "        maxSdkVersion = ", "\n")) != null) {
            str2 = strB;
        }
        String packageName = projectEntity.getPackageName();
        int iMax = Math.max(36, projectEntity.getTargetSdk());
        String packageName2 = projectEntity.getPackageName();
        int minSdk = projectEntity.getMinSdk();
        int targetSdk = projectEntity.getTargetSdk();
        int versionCode = projectEntity.getVersionCode();
        String versionName = projectEntity.getVersionName();
        StringBuilder sbA = h.a(iMax, "plugins {\n    id(\"com.android.application\")\n    id(\"org.jetbrains.kotlin.android\")\n}\n\nandroid {\n    namespace = \"", packageName, "\"\n    compileSdk = ", "\n\n    defaultConfig {\n        applicationId = \"");
        sbA.append(packageName2);
        sbA.append("\"\n        minSdk = ");
        sbA.append(minSdk);
        sbA.append("\n        targetSdk = ");
        sbA.append(targetSdk);
        sbA.append("\n");
        sbA.append(str2);
        sbA.append("        versionCode = ");
        sbA.append(versionCode);
        sbA.append("\n        versionName = \"");
        sbA.append(versionName);
        sbA.append("\"\n    }\n\n    buildFeatures { buildConfig = true }\n\n    buildTypes {\n        release {\n            isMinifyEnabled = false\n            proguardFiles(\n                getDefaultProguardFile(\"proguard-android-optimize.txt\"),\n                \"proguard-rules.pro\"\n            )\n        }\n    }\n\n    compileOptions {\n        sourceCompatibility = JavaVersion.VERSION_17\n        targetCompatibility = JavaVersion.VERSION_17\n    }\n\n    kotlinOptions {\n        jvmTarget = \"17\"\n    }\n}\n\ndependencies {\n    implementation(\"androidx.appcompat:appcompat:1.7.1\")\n    implementation(\"androidx.activity:activity-ktx:1.10.1\")\n    implementation(\"com.google.android.material:material:1.14.0\")\n    implementation(\"androidx.constraintlayout:constraintlayout:2.2.1\")\n    implementation(\"androidx.webkit:webkit:1.12.1\")\n    implementation(\"androidx.recyclerview:recyclerview:1.3.2\")\n    implementation(\"com.google.guava:guava:33.3.1-android\")\n\n    implementation(\"androidx.swiperefreshlayout:swiperefreshlayout:1.1.0\")\n    implementation(\"androidx.camera:camera-core:1.4.2\")\n    implementation(\"androidx.camera:camera-camera2:1.4.2\")\n    implementation(\"androidx.camera:camera-lifecycle:1.4.2\")\n    implementation(\"androidx.camera:camera-view:1.4.2\")\n");
        sbA.append(str3);
        sbA.append("\n}\n");
        String strC = mh.p.c(sbA.toString());
        File file3 = new File(file, "app/build.gradle.kts");
        File parentFile = file3.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        l.r(file3, strC, mh.a.f18238b);
        Collection collection = z.f22752a;
        Context context = this.f16765a;
        InputStream inputStreamOpen = context.getAssets().open("android_project_template/app/src/main/AndroidManifest.xml");
        r.d(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, mh.a.f18238b), 8192);
        try {
            String strD = p.d(bufferedReader);
            bufferedReader.close();
            String strA = a(strD, b(projectEntity));
            String permissionsJson = projectEntity.getPermissionsJson();
            int i11 = 0;
            try {
                try {
                    JSONArray jSONArray = new JSONArray(permissionsJson);
                    g gVarQ = jh.j.q(0, jSONArray.length());
                    arrayList = new ArrayList(qg.p.h(gVarQ, 10));
                    f it = gVarQ.iterator();
                    while (it.f15749c) {
                        arrayList.add(jSONArray.getString(it.nextInt()));
                    }
                } catch (Exception unused) {
                    List listO = x.O(x.L(permissionsJson, "[", "]"), new String[]{","});
                    ArrayList arrayList2 = new ArrayList(qg.p.h(listO, 10));
                    Iterator it2 = listO.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(x.K(x.W((String) it2.next()).toString(), "\""));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        if (!x.A((String) obj)) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList = arrayList3;
                }
            } catch (Exception unused2) {
                arrayList = collection;
            }
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strA)));
            Element documentElement = document.getDocumentElement();
            if (!r.a(projectEntity.getContentSourceType(), "url")) {
                collectionJ = collection;
                if (projectEntity.getAdmobEnabled()) {
                    collectionJ = qg.p.j("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE");
                }
            }
            Set setG0 = qg.x.g0(qg.x.O(collectionJ, arrayList));
            if (projectEntity.getAdmobEnabled()) {
                setG0.add("com.google.android.gms.permission.AD_ID");
            }
            NodeList elementsByTagName = documentElement.getElementsByTagName("uses-permission");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = elementsByTagName.getLength() - 1;
            while (true) {
                if (-1 >= length) {
                    break;
                }
                Node nodeItem = elementsByTagName.item(length);
                r.c(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
                Element element = (Element) nodeItem;
                String attributeNS = element.getAttributeNS(AndroidManifestAttrs.NAMESPACE, "name");
                if (setG0.contains(attributeNS)) {
                    r.b(attributeNS);
                    linkedHashSet.add(attributeNS);
                } else {
                    documentElement.removeChild(element);
                }
                length--;
            }
            Set setC = n0.c(setG0, linkedHashSet);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : setC) {
                if (!x.A((String) obj2)) {
                    arrayList4.add(obj2);
                }
            }
            for (String str4 : qg.x.T(arrayList4)) {
                Element elementCreateElement = document.createElement("uses-permission");
                elementCreateElement.setAttributeNS(AndroidManifestAttrs.NAMESPACE, "android:name", str4);
                documentElement.appendChild(elementCreateElement);
            }
            Node nodeItem2 = documentElement.getElementsByTagName("application").item(0);
            r.c(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
            Element element2 = (Element) nodeItem2;
            element2.setAttributeNS(AndroidManifestAttrs.NAMESPACE, "android:label", "@string/app_name");
            if (projectEntity.getAdmobEnabled()) {
                k kVar = l9.a.f16766a;
                String strC2 = l9.a.c(projectEntity.getAdmobAppId(), projectEntity.getAdmobEnabled(), projectEntity.getAdmobUseTestAds());
                if (strC2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Element elementCreateElement2 = document.createElement("meta-data");
                elementCreateElement2.setAttributeNS(AndroidManifestAttrs.NAMESPACE, "android:name", "com.google.android.gms.ads.APPLICATION_ID");
                elementCreateElement2.setAttributeNS(AndroidManifestAttrs.NAMESPACE, "android:value", strC2);
                element2.appendChild(elementCreateElement2);
            }
            Node nodeItem3 = element2.getElementsByTagName("activity").item(0);
            r.c(nodeItem3, "null cannot be cast to non-null type org.w3c.dom.Element");
            Element element3 = (Element) nodeItem3;
            String orientation = projectEntity.getOrientation();
            element3.setAttributeNS(AndroidManifestAttrs.NAMESPACE, "android:screenOrientation", r.a(orientation, "landscape") ? "landscape" : r.a(orientation, "auto") ? "sensor" : "portrait");
            if (!WebViewSettingsKt.opensExternalPdfs(ProjectAssetWriter.INSTANCE.toProject(projectEntity).getWebViewSettings(), r.a(projectEntity.getContentSourceType(), ProjectKind.PDF))) {
                NodeList elementsByTagName2 = element3.getElementsByTagName("intent-filter");
                int length2 = elementsByTagName2.getLength() - 1;
                for (i10 = -1; i10 < length2; i10 = -1) {
                    Node nodeItem4 = elementsByTagName2.item(length2);
                    r.c(nodeItem4, "null cannot be cast to non-null type org.w3c.dom.Element");
                    Element element4 = (Element) nodeItem4;
                    NodeList nodeList = elementsByTagName2;
                    NodeList elementsByTagName3 = element4.getElementsByTagName("data");
                    int i13 = length2;
                    Iterable iterableQ = jh.j.q(i11, elementsByTagName3.getLength());
                    if (!(iterableQ instanceof Collection) || !((Collection) iterableQ).isEmpty()) {
                        f it3 = iterableQ.iterator();
                        while (true) {
                            if (it3.f15749c) {
                                Node nodeItem5 = elementsByTagName3.item(it3.nextInt());
                                r.c(nodeItem5, "null cannot be cast to non-null type org.w3c.dom.Element");
                                NodeList nodeList2 = elementsByTagName3;
                                if (r.a(((Element) nodeItem5).getAttributeNS(AndroidManifestAttrs.NAMESPACE, "mimeType"), "application/pdf")) {
                                    element3.removeChild(element4);
                                    break;
                                }
                                elementsByTagName3 = nodeList2;
                            }
                        }
                    }
                    length2 = i13 - 1;
                    elementsByTagName2 = nodeList;
                    i11 = 0;
                }
            }
            String deepLinkScheme = projectEntity.getDeepLinkScheme();
            if (deepLinkScheme != null && (string = x.W(deepLinkScheme).toString()) != null) {
                if (x.A(string)) {
                    string = null;
                }
                if (string != null) {
                    Element elementCreateElement3 = document.createElement("intent-filter");
                    for (n nVar : qg.p.j(new n("action", "android.intent.action.VIEW"), new n("category", "android.intent.category.DEFAULT"), new n("category", "android.intent.category.BROWSABLE"))) {
                        String str5 = (String) nVar.f21469a;
                        String str6 = (String) nVar.f21470b;
                        Element elementCreateElement4 = document.createElement(str5);
                        elementCreateElement4.setAttributeNS(AndroidManifestAttrs.NAMESPACE, "android:name", str6);
                        elementCreateElement3.appendChild(elementCreateElement4);
                    }
                    Element elementCreateElement5 = document.createElement("data");
                    elementCreateElement5.setAttributeNS(AndroidManifestAttrs.NAMESPACE, "android:scheme", string);
                    elementCreateElement3.appendChild(elementCreateElement5);
                    element3.appendChild(elementCreateElement3);
                }
            }
            StringWriter stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(document), new StreamResult(stringWriter));
            String string2 = stringWriter.toString();
            r.d(string2, "toString(...)");
            File file4 = new File(file, "app/src/main/AndroidManifest.xml");
            File parentFile2 = file4.getParentFile();
            if (parentFile2 != null) {
                parentFile2.mkdirs();
            }
            l.r(file4, string2, mh.a.f18238b);
            String strM = t.m(projectEntity.getPackageName(), '.', '/');
            Map<String, String> mapB = b(projectEntity);
            String[] list = context.getAssets().list("android_project_template/app/src/main/java/com/htmltoapk/template");
            boolean z11 = false;
            if (list == null) {
                list = new String[0];
            }
            ArrayList arrayList5 = new ArrayList();
            int length3 = list.length;
            int i14 = 0;
            while (i14 < length3) {
                String str7 = list[i14];
                r.b(str7);
                if (t.i(str7, ".kt", z11)) {
                    arrayList5.add(str7);
                }
                i14++;
                z11 = false;
            }
            int size2 = arrayList5.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj3 = arrayList5.get(i15);
                i15++;
                String str8 = (String) obj3;
                e(m3.a.a("android_project_template/app/src/main/java/com/htmltoapk/template/", str8), new File(file, b6.a.b("app/src/main/java/", strM, "/", str8)), mapB);
            }
            String strD2 = i8.n.d("android_project_template/app/src/", projectEntity.getAdmobEnabled() ? "ads" : "noAds", "/java/com/htmltoapk/template");
            String[] list2 = context.getAssets().list(strD2);
            if (list2 == null) {
                list2 = new String[0];
            }
            ArrayList arrayList6 = new ArrayList();
            for (String str9 : list2) {
                r.b(str9);
                if (t.i(str9, ".kt", false)) {
                    arrayList6.add(str9);
                }
            }
            int size3 = arrayList6.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj4 = arrayList6.get(i16);
                i16++;
                String str10 = (String) obj4;
                e(k3.b.a(strD2, "/", str10), new File(file, b6.a.b("app/src/main/java/", strM, "/", str10)), mapB);
            }
            e("android_project_template/app/proguard-rules.pro", new File(file, "app/proguard-rules.pro"), mapB);
            d("android_project_template/app/src/main/res", new File(file, "app/src/main/res"), mapB);
            String primaryColor = projectEntity.getPrimaryColor();
            if (primaryColor == null) {
                primaryColor = "#00E5CC";
            }
            String strC3 = mh.p.c("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<resources>\n    <color name=\"primary\">" + primaryColor + "</color>\n</resources>\n");
            File file5 = new File(file, "app/src/main/res/values/colors.xml");
            File parentFile3 = file5.getParentFile();
            if (parentFile3 != null) {
                parentFile3.mkdirs();
            }
            l.r(file5, strC3, mh.a.f18238b);
            List<n> listJ = qg.p.j(new n("mdpi", 48), new n("hdpi", 72), new n("xhdpi", 96), new n("xxhdpi", 144), new n("xxxhdpi", 192));
            String iconPath = projectEntity.getIconPath();
            if (iconPath != null) {
                file2 = new File(iconPath);
                if (!file2.exists()) {
                    file2 = null;
                }
            }
            File fileGenerateDefaultIcon = file2 == null ? IconGenerator.INSTANCE.generateDefaultIcon(context, projectEntity.getAppName(), projectEntity.getPrimaryColor()) : null;
            for (n nVar2 : listJ) {
                String str11 = (String) nVar2.f21469a;
                int iIntValue = ((Number) nVar2.f21470b).intValue();
                File file6 = new File(file, m3.a.a("app/src/main/res/mipmap-", str11));
                file6.mkdirs();
                if (file2 != null) {
                    l.e(file2, new File(file6, "ic_launcher.png"));
                    l.e(file2, new File(file6, "ic_launcher_round.png"));
                } else if (fileGenerateDefaultIcon != null) {
                    IconGenerator iconGenerator = IconGenerator.INSTANCE;
                    iconGenerator.scaleTo(fileGenerateDefaultIcon, iIntValue, new File(file6, "ic_launcher.png"));
                    iconGenerator.scaleTo(fileGenerateDefaultIcon, iIntValue, new File(file6, "ic_launcher_round.png"));
                } else {
                    c(new File(file6, "ic_launcher.png"), i8.n.d("android_project_template/app/src/main/res/mipmap-", str11, "/ic_launcher.png"));
                    c(new File(file6, "ic_launcher_round.png"), o.a(new StringBuilder("android_project_template/app/src/main/res/mipmap-"), str11, "/ic_launcher_round.png"));
                }
            }
            File file7 = new File(file, "app/src/main/assets/www");
            l.f(file7);
            file7.mkdirs();
            boolean z12 = !z10 || (r.a(projectEntity.getBuildMode(), "advanced") && projectEntity.getShowWatermark());
            ProjectAssetWriter projectAssetWriter = ProjectAssetWriter.INSTANCE;
            projectAssetWriter.writeProjectAssets(projectAssetWriter.toProject(ProjectEntity.copy$default(projectEntity, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, z12, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -67108865, -1, 15, null)), file7, z10);
        } finally {
        }
    }
}
