package com.basitce.htmltoapk.domain.model;

import androidx.room.z0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import l0.k;
import r.o2;

/* loaded from: classes.dex */
public final class BuildConfiguration {
    public static final int $stable = Project.$stable;
    private final boolean isPremium;
    private final String keyAlias;
    private final String keyPassword;
    private final String keystorePassword;
    private final String keystorePath;
    private final boolean nativeApisUnlocked;
    private final String outputFormat;
    private final Project project;
    private final boolean useCustomKeystore;

    public BuildConfiguration(Project project, String outputFormat, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        r.e(project, "project");
        r.e(outputFormat, "outputFormat");
        this.project = project;
        this.outputFormat = outputFormat;
        this.keystorePath = str;
        this.keystorePassword = str2;
        this.keyAlias = str3;
        this.keyPassword = str4;
        this.useCustomKeystore = z10;
        this.isPremium = z11;
        this.nativeApisUnlocked = z12;
    }

    public static /* synthetic */ BuildConfiguration copy$default(BuildConfiguration buildConfiguration, Project project, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            project = buildConfiguration.project;
        }
        if ((i10 & 2) != 0) {
            str = buildConfiguration.outputFormat;
        }
        if ((i10 & 4) != 0) {
            str2 = buildConfiguration.keystorePath;
        }
        if ((i10 & 8) != 0) {
            str3 = buildConfiguration.keystorePassword;
        }
        if ((i10 & 16) != 0) {
            str4 = buildConfiguration.keyAlias;
        }
        if ((i10 & 32) != 0) {
            str5 = buildConfiguration.keyPassword;
        }
        if ((i10 & 64) != 0) {
            z10 = buildConfiguration.useCustomKeystore;
        }
        if ((i10 & 128) != 0) {
            z11 = buildConfiguration.isPremium;
        }
        if ((i10 & 256) != 0) {
            z12 = buildConfiguration.nativeApisUnlocked;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str6 = str5;
        boolean z15 = z10;
        String str7 = str4;
        String str8 = str2;
        return buildConfiguration.copy(project, str, str8, str3, str7, str6, z15, z13, z14);
    }

    public final Project component1() {
        return this.project;
    }

    public final String component2() {
        return this.outputFormat;
    }

    public final String component3() {
        return this.keystorePath;
    }

    public final String component4() {
        return this.keystorePassword;
    }

    public final String component5() {
        return this.keyAlias;
    }

    public final String component6() {
        return this.keyPassword;
    }

    public final boolean component7() {
        return this.useCustomKeystore;
    }

    public final boolean component8() {
        return this.isPremium;
    }

    public final boolean component9() {
        return this.nativeApisUnlocked;
    }

    public final BuildConfiguration copy(Project project, String outputFormat, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        r.e(project, "project");
        r.e(outputFormat, "outputFormat");
        return new BuildConfiguration(project, outputFormat, str, str2, str3, str4, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuildConfiguration)) {
            return false;
        }
        BuildConfiguration buildConfiguration = (BuildConfiguration) obj;
        return r.a(this.project, buildConfiguration.project) && r.a(this.outputFormat, buildConfiguration.outputFormat) && r.a(this.keystorePath, buildConfiguration.keystorePath) && r.a(this.keystorePassword, buildConfiguration.keystorePassword) && r.a(this.keyAlias, buildConfiguration.keyAlias) && r.a(this.keyPassword, buildConfiguration.keyPassword) && this.useCustomKeystore == buildConfiguration.useCustomKeystore && this.isPremium == buildConfiguration.isPremium && this.nativeApisUnlocked == buildConfiguration.nativeApisUnlocked;
    }

    public final String getKeyAlias() {
        return this.keyAlias;
    }

    public final String getKeyPassword() {
        return this.keyPassword;
    }

    public final String getKeystorePassword() {
        return this.keystorePassword;
    }

    public final String getKeystorePath() {
        return this.keystorePath;
    }

    public final boolean getNativeApisUnlocked() {
        return this.nativeApisUnlocked;
    }

    public final String getOutputFormat() {
        return this.outputFormat;
    }

    public final Project getProject() {
        return this.project;
    }

    public final boolean getUseCustomKeystore() {
        return this.useCustomKeystore;
    }

    public int hashCode() {
        int iA = k.a(this.project.hashCode() * 31, 31, this.outputFormat);
        String str = this.keystorePath;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.keystorePassword;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.keyAlias;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.keyPassword;
        return Boolean.hashCode(this.nativeApisUnlocked) + o2.a(o2.a((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.useCustomKeystore), 31, this.isPremium);
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public String toString() {
        Project project = this.project;
        String str = this.outputFormat;
        String str2 = this.keystorePath;
        String str3 = this.keystorePassword;
        String str4 = this.keyAlias;
        String str5 = this.keyPassword;
        boolean z10 = this.useCustomKeystore;
        boolean z11 = this.isPremium;
        boolean z12 = this.nativeApisUnlocked;
        StringBuilder sb = new StringBuilder("BuildConfiguration(project=");
        sb.append(project);
        sb.append(", outputFormat=");
        sb.append(str);
        sb.append(", keystorePath=");
        z0.a(sb, str2, ", keystorePassword=", str3, ", keyAlias=");
        z0.a(sb, str4, ", keyPassword=", str5, ", useCustomKeystore=");
        sb.append(z10);
        sb.append(", isPremium=");
        sb.append(z11);
        sb.append(", nativeApisUnlocked=");
        sb.append(z12);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ BuildConfiguration(Project project, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, int i10, j jVar) {
        this(project, (i10 & 2) != 0 ? ProjectKind.APK : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) == 0 ? str5 : null, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? false : z12);
    }
}
