package com.basitce.htmltoapk.data.apkgenerator;

import android.R;
import com.android.aapt.Resources;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import pg.n;
import qg.h0;
import qg.p;
import qg.z;

/* loaded from: classes.dex */
public final class AabManifestEditor {
    public static final int $stable = 0;
    private static final String ANDROID_NS = "http://schemas.android.com/apk/res/android";
    public static final AabManifestEditor INSTANCE = new AabManifestEditor();
    private static final String PDF_MIME = "application/pdf";

    private AabManifestEditor() {
    }

    private final boolean activityHasMainLauncherFilter(Resources.XmlElement.Builder builder) {
        Object next;
        Object next2;
        int childCount = builder.getChildCount();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            Resources.XmlNode.Builder childBuilder = builder.getChildBuilder(i10);
            if (childBuilder.hasElement() && r.a(childBuilder.getElementBuilder().getName(), "intent-filter")) {
                Resources.XmlElement.Builder elementBuilder = childBuilder.getElementBuilder();
                int childCount2 = elementBuilder.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    Resources.XmlNode.Builder childBuilder2 = elementBuilder.getChildBuilder(i11);
                    if (childBuilder2.hasElement()) {
                        Resources.XmlElement.Builder elementBuilder2 = childBuilder2.getElementBuilder();
                        String name = elementBuilder2.getName();
                        if (r.a(name, "action")) {
                            List<Resources.XmlAttribute> attributeList = elementBuilder2.getAttributeList();
                            r.d(attributeList, "getAttributeList(...)");
                            Iterator<T> it = attributeList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                                Resources.XmlAttribute xmlAttribute = (Resources.XmlAttribute) next2;
                                if (r.a(xmlAttribute.getNamespaceUri(), "http://schemas.android.com/apk/res/android") && r.a(xmlAttribute.getName(), "name")) {
                                    break;
                                }
                            }
                            Resources.XmlAttribute xmlAttribute2 = (Resources.XmlAttribute) next2;
                            if (r.a(xmlAttribute2 != null ? xmlAttribute2.getValue() : null, "android.intent.action.MAIN")) {
                                z10 = true;
                            }
                        } else if (r.a(name, "category")) {
                            List<Resources.XmlAttribute> attributeList2 = elementBuilder2.getAttributeList();
                            r.d(attributeList2, "getAttributeList(...)");
                            Iterator<T> it2 = attributeList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                Resources.XmlAttribute xmlAttribute3 = (Resources.XmlAttribute) next;
                                if (r.a(xmlAttribute3.getNamespaceUri(), "http://schemas.android.com/apk/res/android") && r.a(xmlAttribute3.getName(), "name")) {
                                    break;
                                }
                            }
                            Resources.XmlAttribute xmlAttribute4 = (Resources.XmlAttribute) next;
                            if (r.a(xmlAttribute4 != null ? xmlAttribute4.getValue() : null, "android.intent.category.LAUNCHER")) {
                                z11 = true;
                            }
                        }
                    }
                }
            }
        }
        return z10 && z11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Resources.XmlAttribute createAttribute(String str, String str2) {
        int i10;
        switch (str.hashCode()) {
            case -1312692432:
                if (!str.equals("minSdkVersion")) {
                    i10 = 0;
                    break;
                } else {
                    i10 = R.attr.minSdkVersion;
                    break;
                }
            case -907987547:
                if (str.equals("scheme")) {
                    i10 = R.attr.scheme;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    i10 = R.attr.name;
                    break;
                }
                break;
            case 102727412:
                if (str.equals(AnnotatedPrivateKey.LABEL)) {
                    i10 = R.attr.label;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    i10 = R.attr.value;
                    break;
                }
                break;
            case 508537451:
                if (str.equals("allowBackup")) {
                    i10 = R.attr.allowBackup;
                    break;
                }
                break;
            case 688591589:
                if (str.equals("versionCode")) {
                    i10 = R.attr.versionCode;
                    break;
                }
                break;
            case 688906115:
                if (str.equals("versionName")) {
                    i10 = R.attr.versionName;
                    break;
                }
                break;
            case 817409352:
                if (str.equals("enableOnBackInvokedCallback")) {
                    i10 = R.attr.windowLayoutAffinity;
                    break;
                }
                break;
            case 1159968706:
                if (str.equals("maxSdkVersion")) {
                    i10 = R.attr.maxSdkVersion;
                    break;
                }
                break;
            case 1346695087:
                if (str.equals("targetSdkVersion")) {
                    i10 = R.attr.targetSdkVersion;
                    break;
                }
                break;
            case 1940854671:
                if (str.equals("usesCleartextTraffic")) {
                    i10 = R.attr.usesCleartextTraffic;
                    break;
                }
                break;
        }
        Resources.XmlAttribute.Builder value = Resources.XmlAttribute.newBuilder().setNamespaceUri("http://schemas.android.com/apk/res/android").setName(str).setValue(str2);
        if (i10 != 0) {
            value.setResourceId(i10);
        }
        Resources.XmlAttribute xmlAttributeBuild = value.build();
        r.d(xmlAttributeBuild, "build(...)");
        return xmlAttributeBuild;
    }

    private final Resources.XmlElement.Builder findChildElement(Resources.XmlElement.Builder builder, String str) {
        int childCount = builder.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Resources.XmlNode.Builder childBuilder = builder.getChildBuilder(i10);
            if (childBuilder.hasElement() && r.a(childBuilder.getElementBuilder().getName(), str)) {
                return childBuilder.getElementBuilder();
            }
        }
        return null;
    }

    private final Resources.XmlElement.Builder findMainActivity(Resources.XmlElement.Builder builder) {
        int childCount = builder.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Resources.XmlNode.Builder childBuilder = builder.getChildBuilder(i10);
            if (childBuilder.hasElement() && r.a(childBuilder.getElementBuilder().getName(), "application")) {
                Resources.XmlElement.Builder elementBuilder = childBuilder.getElementBuilder();
                int childCount2 = elementBuilder.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    Resources.XmlNode.Builder childBuilder2 = elementBuilder.getChildBuilder(i11);
                    if (childBuilder2.hasElement() && r.a(childBuilder2.getElementBuilder().getName(), "activity")) {
                        Resources.XmlElement.Builder elementBuilder2 = childBuilder2.getElementBuilder();
                        r.b(elementBuilder2);
                        if (activityHasMainLauncherFilter(elementBuilder2)) {
                            return childBuilder2.getElementBuilder();
                        }
                    }
                }
            }
        }
        return null;
    }

    private final boolean isPdfViewFilter(Resources.XmlElement.Builder builder) {
        if (!r.a(builder.getName(), "intent-filter")) {
            return false;
        }
        List<Resources.XmlNode.Builder> childBuilderList = builder.getChildBuilderList();
        r.d(childBuilderList, "getChildBuilderList(...)");
        if (childBuilderList.isEmpty()) {
            return false;
        }
        for (Resources.XmlNode.Builder builder2 : childBuilderList) {
            if (builder2.hasElement() && r.a(builder2.getElementBuilder().getName(), "data")) {
                List<Resources.XmlAttribute> attributeList = builder2.getElementBuilder().getAttributeList();
                r.d(attributeList, "getAttributeList(...)");
                if (attributeList.isEmpty()) {
                    continue;
                } else {
                    for (Resources.XmlAttribute xmlAttribute : attributeList) {
                        if (r.a(xmlAttribute.getNamespaceUri(), "http://schemas.android.com/apk/res/android") && r.a(xmlAttribute.getName(), "mimeType") && r.a(xmlAttribute.getValue(), PDF_MIME)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final void removeAttribute(Resources.XmlElement.Builder builder, String str, String str2) {
        int i10 = 0;
        jh.g gVarQ = jh.j.q(0, builder.getAttributeCount());
        ArrayList arrayList = new ArrayList(p.h(gVarQ, 10));
        Iterator<Integer> it = gVarQ.iterator();
        while (it.hasNext()) {
            arrayList.add(builder.getAttributeBuilder(((h0) it).nextInt()).build());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Resources.XmlAttribute xmlAttribute = (Resources.XmlAttribute) obj;
            if (!r.a(xmlAttribute.getNamespaceUri(), str) || !r.a(xmlAttribute.getName(), str2)) {
                arrayList2.add(obj);
            }
        }
        builder.clearAttribute();
        builder.addAllAttribute(arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r2 = r12;
        r5 = r13;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r0.equals("application") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.equals("activity-alias") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0.equals("service") == false) goto L6;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void renamePackageReferences(Resources.XmlElement.Builder builder, String str, String str2) {
        Resources.XmlElement.Builder builder2;
        String str3;
        String str4;
        String name = builder.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1655966961:
                    builder2 = builder;
                    str3 = str;
                    str4 = str2;
                    if (name.equals("activity")) {
                        updateComponentName(builder2, str3, str4);
                        break;
                    }
                    break;
                case -987494927:
                    builder2 = builder;
                    str3 = str;
                    str4 = str2;
                    if (name.equals("provider")) {
                        updateAttributeIfStartsWith(builder2, "http://schemas.android.com/apk/res/android", "authorities", str3, str4);
                        str3 = str3;
                        str4 = str4;
                        updateComponentName(builder2, str3, str4);
                        break;
                    } else {
                        break;
                    }
                case -808719889:
                    builder2 = builder;
                    str3 = str;
                    str4 = str2;
                    if (name.equals("receiver")) {
                        updateComponentName(builder2, str3, str4);
                        break;
                    }
                    break;
                case -517618225:
                    if (name.equals("permission")) {
                        builder2 = builder;
                        str3 = str;
                        str4 = str2;
                        updateAttributeIfStartsWith(builder2, "http://schemas.android.com/apk/res/android", "name", str3, str4);
                        break;
                    } else {
                        builder2 = builder;
                        str3 = str;
                        str4 = str2;
                        break;
                    }
                case 599862896:
                    if (!name.equals("uses-permission")) {
                    }
                    break;
                case 790287890:
                    break;
                case 1554253136:
                    break;
                case 1984153269:
                    break;
            }
        }
        int childCount = builder2.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Resources.XmlNode.Builder childBuilder = builder2.getChildBuilder(i10);
            if (childBuilder.hasElement()) {
                Resources.XmlElement.Builder elementBuilder = childBuilder.getElementBuilder();
                r.d(elementBuilder, "getElementBuilder(...)");
                renamePackageReferences(elementBuilder, str3, str4);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final void setOrUpdateAttribute(Resources.XmlElement.Builder builder, String str, String str2, String str3, boolean z10) {
        int attributeCount = builder.getAttributeCount();
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            Resources.XmlAttribute.Builder attributeBuilder = builder.getAttributeBuilder(i11);
            if (r.a(attributeBuilder.getNamespaceUri(), str) && r.a(attributeBuilder.getName(), str2)) {
                attributeBuilder.setValue(str3);
                if (z10 && attributeBuilder.hasCompiledItem()) {
                    Resources.Item.Builder compiledItemBuilder = attributeBuilder.getCompiledItemBuilder();
                    if (compiledItemBuilder.hasPrim()) {
                        compiledItemBuilder.getPrimBuilder().setIntDecimalValue(Integer.parseInt(str3));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        switch (str2.hashCode()) {
            case -1312692432:
                if (str2.equals("minSdkVersion")) {
                    i10 = R.attr.minSdkVersion;
                    break;
                }
                break;
            case -907987547:
                if (str2.equals("scheme")) {
                    i10 = R.attr.scheme;
                    break;
                }
                break;
            case 3373707:
                if (str2.equals("name")) {
                    i10 = R.attr.name;
                    break;
                }
                break;
            case 102727412:
                if (str2.equals(AnnotatedPrivateKey.LABEL)) {
                    i10 = R.attr.label;
                    break;
                }
                break;
            case 111972721:
                if (str2.equals("value")) {
                    i10 = R.attr.value;
                    break;
                }
                break;
            case 508537451:
                if (str2.equals("allowBackup")) {
                    i10 = R.attr.allowBackup;
                    break;
                }
                break;
            case 688591589:
                if (str2.equals("versionCode")) {
                    i10 = R.attr.versionCode;
                    break;
                }
                break;
            case 688906115:
                if (str2.equals("versionName")) {
                    i10 = R.attr.versionName;
                    break;
                }
                break;
            case 817409352:
                if (str2.equals("enableOnBackInvokedCallback")) {
                    i10 = R.attr.windowLayoutAffinity;
                    break;
                }
                break;
            case 1159968706:
                if (str2.equals("maxSdkVersion")) {
                    i10 = R.attr.maxSdkVersion;
                    break;
                }
                break;
            case 1346695087:
                if (str2.equals("targetSdkVersion")) {
                    i10 = R.attr.targetSdkVersion;
                    break;
                }
                break;
            case 1940854671:
                if (str2.equals("usesCleartextTraffic")) {
                    i10 = R.attr.usesCleartextTraffic;
                    break;
                }
                break;
        }
        Resources.XmlAttribute.Builder value = Resources.XmlAttribute.newBuilder().setNamespaceUri(str).setName(str2).setValue(str3);
        if (r.a(str, "http://schemas.android.com/apk/res/android") && i10 != 0) {
            value.setResourceId(i10);
        }
        if (z10) {
            value.setCompiledItem(Resources.Item.newBuilder().setPrim(Resources.Primitive.newBuilder().setIntDecimalValue(Integer.parseInt(str3)).build()).build());
        }
        builder.addAttribute(value.build());
    }

    public static /* synthetic */ void setOrUpdateAttribute$default(AabManifestEditor aabManifestEditor, Resources.XmlElement.Builder builder, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        aabManifestEditor.setOrUpdateAttribute(builder, str, str2, str3, z10);
    }

    private final void updateAttributeIfStartsWith(Resources.XmlElement.Builder builder, String str, String str2, String str3, String str4) {
        int attributeCount = builder.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            Resources.XmlAttribute.Builder attributeBuilder = builder.getAttributeBuilder(i10);
            if (r.a(attributeBuilder.getNamespaceUri(), str) && r.a(attributeBuilder.getName(), str2)) {
                String value = attributeBuilder.getValue();
                r.b(value);
                if (t.p(value, str3, false)) {
                    attributeBuilder.setValue(str4 + x.I(value, str3));
                    return;
                }
                return;
            }
        }
    }

    private final void updateComponentName(Resources.XmlElement.Builder builder, String str, String str2) {
        int attributeCount = builder.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            Resources.XmlAttribute.Builder attributeBuilder = builder.getAttributeBuilder(i10);
            if (r.a(attributeBuilder.getNamespaceUri(), "http://schemas.android.com/apk/res/android") && r.a(attributeBuilder.getName(), "name")) {
                String value = attributeBuilder.getValue();
                r.b(value);
                if (t.p(value, str, false)) {
                    value = k3.a.a(str2, x.I(value, str));
                } else if (t.p(value, ".", false)) {
                    value = k3.a.a(str2, value);
                }
                attributeBuilder.setValue(value);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n updateManifest$default(AabManifestEditor aabManifestEditor, Resources.XmlNode xmlNode, String str, int i10, String str2, String str3, int i11, int i12, Integer num, List list, String str4, String str5, boolean z10, int i13, Object obj) {
        if ((i13 & 128) != 0) {
            num = null;
        }
        if ((i13 & 256) != 0) {
            list = z.f22752a;
        }
        if ((i13 & 512) != 0) {
            str4 = null;
        }
        if ((i13 & 1024) != 0) {
            str5 = null;
        }
        if ((i13 & 2048) != 0) {
            z10 = true;
        }
        return aabManifestEditor.updateManifest(xmlNode, str, i10, str2, str3, i11, i12, num, list, str4, str5, z10);
    }

    public final Resources.XmlNode parse(byte[] bytes) throws InvalidProtocolBufferException {
        r.e(bytes, "bytes");
        Resources.XmlNode from = Resources.XmlNode.parseFrom(bytes);
        r.d(from, "parseFrom(...)");
        return from;
    }

    public final byte[] serialize(Resources.XmlNode node) {
        r.e(node, "node");
        byte[] byteArray = node.toByteArray();
        r.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n<Resources.XmlNode, String> updateManifest(Resources.XmlNode node, String packageName, int i10, String versionName, String appName, int i11, int i12, Integer num, List<String> permissions, String str, String str2, boolean z10) {
        Object next;
        String value;
        String str3;
        String str4;
        String str5;
        String string;
        Resources.XmlElement.Builder builderFindMainActivity;
        Resources.XmlElement.Builder builderFindMainActivity2;
        Object next2;
        String value2;
        String string2;
        Object obj;
        int i13;
        r.e(node, "node");
        r.e(packageName, "packageName");
        r.e(versionName, "versionName");
        r.e(appName, "appName");
        r.e(permissions, "permissions");
        Resources.XmlNode.Builder builder = node.toBuilder();
        Resources.XmlElement.Builder elementBuilder = builder.getElementBuilder();
        if (!r.a(elementBuilder.getName(), "manifest")) {
            throw new IllegalArgumentException(i8.n.d("Root element must be <manifest>, found <", elementBuilder.getName(), ">").toString());
        }
        List<Resources.XmlAttribute> attributeList = elementBuilder.getAttributeList();
        r.d(attributeList, "getAttributeList(...)");
        Iterator<T> it = attributeList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Resources.XmlAttribute xmlAttribute = (Resources.XmlAttribute) next;
            if (r.a(xmlAttribute.getName(), "package")) {
                String namespaceUri = xmlAttribute.getNamespaceUri();
                r.d(namespaceUri, "getNamespaceUri(...)");
                if (namespaceUri.length() == 0) {
                    break;
                }
            }
        }
        Resources.XmlAttribute xmlAttribute2 = (Resources.XmlAttribute) next;
        if (xmlAttribute2 == null || (value = xmlAttribute2.getValue()) == null) {
            value = "";
        }
        String str6 = value;
        setOrUpdateAttribute$default(this, elementBuilder, "", "package", packageName, false, 16, null);
        setOrUpdateAttribute(elementBuilder, "http://schemas.android.com/apk/res/android", "versionCode", String.valueOf(i10), true);
        setOrUpdateAttribute$default(this, elementBuilder, "http://schemas.android.com/apk/res/android", "versionName", versionName, false, 16, null);
        Resources.XmlElement.Builder builderFindChildElement = findChildElement(elementBuilder, "uses-sdk");
        if (builderFindChildElement != null) {
            AabManifestEditor aabManifestEditor = INSTANCE;
            aabManifestEditor.setOrUpdateAttribute(builderFindChildElement, "http://schemas.android.com/apk/res/android", "minSdkVersion", String.valueOf(i11), true);
            aabManifestEditor.setOrUpdateAttribute(builderFindChildElement, "http://schemas.android.com/apk/res/android", "targetSdkVersion", String.valueOf(i12), true);
            if (num != null) {
                aabManifestEditor.setOrUpdateAttribute(builderFindChildElement, "http://schemas.android.com/apk/res/android", "maxSdkVersion", num.toString(), true);
            } else {
                aabManifestEditor.removeAttribute(builderFindChildElement, "http://schemas.android.com/apk/res/android", "maxSdkVersion");
            }
        }
        Resources.XmlElement.Builder builderFindChildElement2 = findChildElement(elementBuilder, "application");
        if (builderFindChildElement2 != null) {
            AabManifestEditor aabManifestEditor2 = INSTANCE;
            str5 = str6;
            String str7 = "getAttributeList(...)";
            str3 = packageName;
            setOrUpdateAttribute$default(aabManifestEditor2, builderFindChildElement2, "http://schemas.android.com/apk/res/android", AnnotatedPrivateKey.LABEL, appName, false, 16, null);
            aabManifestEditor2.setOrUpdateAttribute(builderFindChildElement2, "http://schemas.android.com/apk/res/android", "allowBackup", "false", false);
            aabManifestEditor2.setOrUpdateAttribute(builderFindChildElement2, "http://schemas.android.com/apk/res/android", "usesCleartextTraffic", "true", false);
            aabManifestEditor2.setOrUpdateAttribute(builderFindChildElement2, "http://schemas.android.com/apk/res/android", "enableOnBackInvokedCallback", "true", false);
            aabManifestEditor2.removeAttribute(builderFindChildElement2, "http://schemas.android.com/apk/res/android", "debuggable");
            aabManifestEditor2.removeAttribute(builderFindChildElement2, "http://schemas.android.com/apk/res/android", "testOnly");
            if (str2 == null || (string2 = x.W(str2).toString()) == null) {
                str4 = str7;
            } else {
                String str8 = !x.A(string2) ? string2 : null;
                if (str8 != null) {
                    jh.g gVarQ = jh.j.q(0, builderFindChildElement2.getChildCount());
                    ArrayList arrayList = new ArrayList(p.h(gVarQ, 10));
                    jh.f it2 = gVarQ.iterator();
                    while (it2.f15749c) {
                        arrayList.add(builderFindChildElement2.getChildBuilder(it2.nextInt()));
                    }
                    int size = arrayList.size();
                    int i14 = 0;
                    loop2: while (true) {
                        if (i14 >= size) {
                            str4 = str7;
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i14);
                        i14++;
                        Resources.XmlNode.Builder builder2 = (Resources.XmlNode.Builder) obj;
                        if (builder2.hasElement() && r.a(builder2.getElementBuilder().getName(), "meta-data")) {
                            List<Resources.XmlAttribute> attributeList2 = builder2.getElementBuilder().getAttributeList();
                            i13 = size;
                            str4 = str7;
                            r.d(attributeList2, str4);
                            if (!attributeList2.isEmpty()) {
                                Iterator it3 = attributeList2.iterator();
                                while (it3.hasNext()) {
                                    Resources.XmlAttribute xmlAttribute3 = (Resources.XmlAttribute) it3.next();
                                    Iterator it4 = it3;
                                    if (r.a(xmlAttribute3.getNamespaceUri(), "http://schemas.android.com/apk/res/android") && r.a(xmlAttribute3.getName(), "name") && r.a(xmlAttribute3.getValue(), "com.google.android.gms.ads.APPLICATION_ID")) {
                                        break loop2;
                                    }
                                    it3 = it4;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            i13 = size;
                            str4 = str7;
                        }
                        str7 = str4;
                        size = i13;
                    }
                    Resources.XmlNode.Builder builder3 = (Resources.XmlNode.Builder) obj;
                    if (builder3 != null) {
                        AabManifestEditor aabManifestEditor3 = INSTANCE;
                        Resources.XmlElement.Builder elementBuilder2 = builder3.getElementBuilder();
                        r.d(elementBuilder2, "getElementBuilder(...)");
                        setOrUpdateAttribute$default(aabManifestEditor3, elementBuilder2, "http://schemas.android.com/apk/res/android", "value", str8, false, 16, null);
                    } else {
                        Resources.XmlElement.Builder name = Resources.XmlElement.newBuilder().setName("meta-data");
                        AabManifestEditor aabManifestEditor4 = INSTANCE;
                        builderFindChildElement2.addChild(Resources.XmlNode.newBuilder().setElement(name.addAttribute(aabManifestEditor4.createAttribute("name", "com.google.android.gms.ads.APPLICATION_ID")).addAttribute(aabManifestEditor4.createAttribute("value", str8)).build()).build());
                    }
                }
            }
        } else {
            str3 = packageName;
            str4 = "getAttributeList(...)";
            str5 = str6;
        }
        if (str5.length() > 0 && !str5.equals(str3)) {
            renamePackageReferences(elementBuilder, str5, str3);
        }
        List<Resources.XmlNode> childList = elementBuilder.getChildList();
        r.d(childList, "getChildList(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : childList) {
            Resources.XmlNode xmlNode = (Resources.XmlNode) obj2;
            if (xmlNode.hasElement() && r.a(xmlNode.getElement().getName(), "uses-permission")) {
                List<Resources.XmlAttribute> attributeList3 = xmlNode.getElement().getAttributeList();
                r.d(attributeList3, str4);
                Iterator<T> it5 = attributeList3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                    Resources.XmlAttribute xmlAttribute4 = (Resources.XmlAttribute) next2;
                    if (r.a(xmlAttribute4.getNamespaceUri(), "http://schemas.android.com/apk/res/android") && r.a(xmlAttribute4.getName(), "name")) {
                        break;
                    }
                }
                Resources.XmlAttribute xmlAttribute5 = (Resources.XmlAttribute) next2;
                if (xmlAttribute5 == null || (value2 = xmlAttribute5.getValue()) == null || !t.p(value2, "android.permission.", false)) {
                }
            }
            arrayList2.add(obj2);
        }
        elementBuilder.clearChild();
        elementBuilder.addAllChild(arrayList2);
        Iterator it6 = qg.x.x(qg.x.O(str2 != null ? p.j("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "com.google.android.gms.permission.AD_ID") : z.f22752a, permissions)).iterator();
        while (it6.hasNext()) {
            elementBuilder.addChild(0, Resources.XmlNode.newBuilder().setElement(Resources.XmlElement.newBuilder().setName("uses-permission").addAttribute(INSTANCE.createAttribute("name", (String) it6.next())).build()).build());
        }
        if (str == null || (string = x.W(str).toString()) == null || x.A(string)) {
            string = null;
        }
        if (string != null && (builderFindMainActivity2 = findMainActivity(elementBuilder)) != null) {
            Resources.XmlNode.Builder builderNewBuilder = Resources.XmlNode.newBuilder();
            Resources.XmlElement.Builder name2 = Resources.XmlElement.newBuilder().setName("intent-filter");
            Resources.XmlNode.Builder builderNewBuilder2 = Resources.XmlNode.newBuilder();
            Resources.XmlElement.Builder name3 = Resources.XmlElement.newBuilder().setName("action");
            AabManifestEditor aabManifestEditor5 = INSTANCE;
            builderFindMainActivity2.addChild(builderNewBuilder.setElement(name2.addChild(builderNewBuilder2.setElement(name3.addAttribute(aabManifestEditor5.createAttribute("name", "android.intent.action.VIEW")).build()).build()).addChild(Resources.XmlNode.newBuilder().setElement(Resources.XmlElement.newBuilder().setName("category").addAttribute(aabManifestEditor5.createAttribute("name", "android.intent.category.DEFAULT")).build()).build()).addChild(Resources.XmlNode.newBuilder().setElement(Resources.XmlElement.newBuilder().setName("category").addAttribute(aabManifestEditor5.createAttribute("name", "android.intent.category.BROWSABLE")).build()).build()).addChild(Resources.XmlNode.newBuilder().setElement(Resources.XmlElement.newBuilder().setName("data").addAttribute(aabManifestEditor5.createAttribute("scheme", string)).build()).build()).build()).build());
        }
        if (!z10 && (builderFindMainActivity = findMainActivity(elementBuilder)) != null) {
            for (int childCount = builderFindMainActivity.getChildCount() - 1; -1 < childCount; childCount--) {
                Resources.XmlNode.Builder childBuilder = builderFindMainActivity.getChildBuilder(childCount);
                if (childBuilder.hasElement()) {
                    AabManifestEditor aabManifestEditor6 = INSTANCE;
                    Resources.XmlElement.Builder elementBuilder3 = childBuilder.getElementBuilder();
                    r.d(elementBuilder3, "getElementBuilder(...)");
                    if (aabManifestEditor6.isPdfViewFilter(elementBuilder3)) {
                        builderFindMainActivity.removeChild(childCount);
                    }
                }
            }
        }
        return new n<>(builder.build(), str5);
    }
}
