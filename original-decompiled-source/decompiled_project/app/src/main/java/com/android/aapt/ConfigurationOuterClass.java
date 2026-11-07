package com.android.aapt;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes.dex */
public final class ConfigurationOuterClass {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013Configuration.proto\u0012\u0007aapt.pb\"¼\u0016\n\rConfiguration\u0012\u000b\n\u0003mcc\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003mnc\u0018\u0002 \u0001(\r\u0012\u000e\n\u0006locale\u0018\u0003 \u0001(\t\u0012@\n\u0010layout_direction\u0018\u0004 \u0001(\u000e2&.aapt.pb.Configuration.LayoutDirection\u0012\u0014\n\fscreen_width\u0018\u0005 \u0001(\r\u0012\u0015\n\rscreen_height\u0018\u0006 \u0001(\r\u0012\u0017\n\u000fscreen_width_dp\u0018\u0007 \u0001(\r\u0012\u0018\n\u0010screen_height_dp\u0018\b \u0001(\r\u0012 \n\u0018smallest_screen_width_dp\u0018\t \u0001(\r\u0012C\n\u0012screen_layout_size\u0018\n \u0001(\u000e2'.aapt.pb.Configuration.ScreenLayoutSize\u0012C\n\u0012screen_layout_long\u0018\u000b \u0001(\u000e2'.aapt.pb.Configuration.ScreenLayoutLong\u00128\n\fscreen_round\u0018\f \u0001(\u000e2\".aapt.pb.Configuration.ScreenRound\u0012?\n\u0010wide_color_gamut\u0018\r \u0001(\u000e2%.aapt.pb.Configuration.WideColorGamut\u0012'\n\u0003hdr\u0018\u000e \u0001(\u000e2\u001a.aapt.pb.Configuration.Hdr\u00127\n\u000borientation\u0018\u000f \u0001(\u000e2\".aapt.pb.Configuration.Orientation\u00127\n\fui_mode_type\u0018\u0010 \u0001(\u000e2!.aapt.pb.Configuration.UiModeType\u00129\n\rui_mode_night\u0018\u0011 \u0001(\u000e2\".aapt.pb.Configuration.UiModeNight\u0012\u000f\n\u0007density\u0018\u0012 \u0001(\r\u00127\n\u000btouchscreen\u0018\u0013 \u0001(\u000e2\".aapt.pb.Configuration.Touchscreen\u00126\n\u000bkeys_hidden\u0018\u0014 \u0001(\u000e2!.aapt.pb.Configuration.KeysHidden\u00121\n\bkeyboard\u0018\u0015 \u0001(\u000e2\u001f.aapt.pb.Configuration.Keyboard\u00124\n\nnav_hidden\u0018\u0016 \u0001(\u000e2 .aapt.pb.Configuration.NavHidden\u00125\n\nnavigation\u0018\u0017 \u0001(\u000e2!.aapt.pb.Configuration.Navigation\u0012\u0013\n\u000bsdk_version\u0018\u0018 \u0001(\r\u0012\u0019\n\u0011sdk_version_minor\u0018\u001b \u0001(\r\u0012D\n\u0012grammatical_gender\u0018\u001a \u0001(\u000e2(.aapt.pb.Configuration.GrammaticalGender\u0012\u000f\n\u0007product\u0018\u0019 \u0001(\t\"a\n\u000fLayoutDirection\u0012\u001a\n\u0016LAYOUT_DIRECTION_UNSET\u0010\u0000\u0012\u0018\n\u0014LAYOUT_DIRECTION_LTR\u0010\u0001\u0012\u0018\n\u0014LAYOUT_DIRECTION_RTL\u0010\u0002\"ª\u0001\n\u0010ScreenLayoutSize\u0012\u001c\n\u0018SCREEN_LAYOUT_SIZE_UNSET\u0010\u0000\u0012\u001c\n\u0018SCREEN_LAYOUT_SIZE_SMALL\u0010\u0001\u0012\u001d\n\u0019SCREEN_LAYOUT_SIZE_NORMAL\u0010\u0002\u0012\u001c\n\u0018SCREEN_LAYOUT_SIZE_LARGE\u0010\u0003\u0012\u001d\n\u0019SCREEN_LAYOUT_SIZE_XLARGE\u0010\u0004\"m\n\u0010ScreenLayoutLong\u0012\u001c\n\u0018SCREEN_LAYOUT_LONG_UNSET\u0010\u0000\u0012\u001b\n\u0017SCREEN_LAYOUT_LONG_LONG\u0010\u0001\u0012\u001e\n\u001aSCREEN_LAYOUT_LONG_NOTLONG\u0010\u0002\"X\n\u000bScreenRound\u0012\u0016\n\u0012SCREEN_ROUND_UNSET\u0010\u0000\u0012\u0016\n\u0012SCREEN_ROUND_ROUND\u0010\u0001\u0012\u0019\n\u0015SCREEN_ROUND_NOTROUND\u0010\u0002\"h\n\u000eWideColorGamut\u0012\u001a\n\u0016WIDE_COLOR_GAMUT_UNSET\u0010\u0000\u0012\u001b\n\u0017WIDE_COLOR_GAMUT_WIDECG\u0010\u0001\u0012\u001d\n\u0019WIDE_COLOR_GAMUT_NOWIDECG\u0010\u0002\"3\n\u0003Hdr\u0012\r\n\tHDR_UNSET\u0010\u0000\u0012\u000e\n\nHDR_HIGHDR\u0010\u0001\u0012\r\n\tHDR_LOWDR\u0010\u0002\"h\n\u000bOrientation\u0012\u0015\n\u0011ORIENTATION_UNSET\u0010\u0000\u0012\u0014\n\u0010ORIENTATION_PORT\u0010\u0001\u0012\u0014\n\u0010ORIENTATION_LAND\u0010\u0002\u0012\u0016\n\u0012ORIENTATION_SQUARE\u0010\u0003\"×\u0001\n\nUiModeType\u0012\u0016\n\u0012UI_MODE_TYPE_UNSET\u0010\u0000\u0012\u0017\n\u0013UI_MODE_TYPE_NORMAL\u0010\u0001\u0012\u0015\n\u0011UI_MODE_TYPE_DESK\u0010\u0002\u0012\u0014\n\u0010UI_MODE_TYPE_CAR\u0010\u0003\u0012\u001b\n\u0017UI_MODE_TYPE_TELEVISION\u0010\u0004\u0012\u001a\n\u0016UI_MODE_TYPE_APPLIANCE\u0010\u0005\u0012\u0016\n\u0012UI_MODE_TYPE_WATCH\u0010\u0006\u0012\u001a\n\u0016UI_MODE_TYPE_VRHEADSET\u0010\u0007\"[\n\u000bUiModeNight\u0012\u0017\n\u0013UI_MODE_NIGHT_UNSET\u0010\u0000\u0012\u0017\n\u0013UI_MODE_NIGHT_NIGHT\u0010\u0001\u0012\u001a\n\u0016UI_MODE_NIGHT_NOTNIGHT\u0010\u0002\"m\n\u000bTouchscreen\u0012\u0015\n\u0011TOUCHSCREEN_UNSET\u0010\u0000\u0012\u0017\n\u0013TOUCHSCREEN_NOTOUCH\u0010\u0001\u0012\u0016\n\u0012TOUCHSCREEN_STYLUS\u0010\u0002\u0012\u0016\n\u0012TOUCHSCREEN_FINGER\u0010\u0003\"v\n\nKeysHidden\u0012\u0015\n\u0011KEYS_HIDDEN_UNSET\u0010\u0000\u0012\u001b\n\u0017KEYS_HIDDEN_KEYSEXPOSED\u0010\u0001\u0012\u001a\n\u0016KEYS_HIDDEN_KEYSHIDDEN\u0010\u0002\u0012\u0018\n\u0014KEYS_HIDDEN_KEYSSOFT\u0010\u0003\"`\n\bKeyboard\u0012\u0012\n\u000eKEYBOARD_UNSET\u0010\u0000\u0012\u0013\n\u000fKEYBOARD_NOKEYS\u0010\u0001\u0012\u0013\n\u000fKEYBOARD_QWERTY\u0010\u0002\u0012\u0016\n\u0012KEYBOARD_TWELVEKEY\u0010\u0003\"V\n\tNavHidden\u0012\u0014\n\u0010NAV_HIDDEN_UNSET\u0010\u0000\u0012\u0019\n\u0015NAV_HIDDEN_NAVEXPOSED\u0010\u0001\u0012\u0018\n\u0014NAV_HIDDEN_NAVHIDDEN\u0010\u0002\"}\n\nNavigation\u0012\u0014\n\u0010NAVIGATION_UNSET\u0010\u0000\u0012\u0014\n\u0010NAVIGATION_NONAV\u0010\u0001\u0012\u0013\n\u000fNAVIGATION_DPAD\u0010\u0002\u0012\u0018\n\u0014NAVIGATION_TRACKBALL\u0010\u0003\u0012\u0014\n\u0010NAVIGATION_WHEEL\u0010\u0004\"v\n\u0011GrammaticalGender\u0012\u0014\n\u0010GRAM_GENDER_USET\u0010\u0000\u0012\u0016\n\u0012GRAM_GENDER_NEUTER\u0010\u0001\u0012\u0018\n\u0014GRAM_GENDER_FEMININE\u0010\u0002\u0012\u0019\n\u0015GRAM_GENDER_MASCULINE\u0010\u0003J\b\b\u001c\u0010\u0080\u0080\u0080\u0080\u0002B\u0012\n\u0010com.android.aaptb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_aapt_pb_Configuration_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_aapt_pb_Configuration_fieldAccessorTable;

    public static final class Configuration extends GeneratedMessageV3 implements ConfigurationOrBuilder {
        public static final int DENSITY_FIELD_NUMBER = 18;
        public static final int GRAMMATICAL_GENDER_FIELD_NUMBER = 26;
        public static final int HDR_FIELD_NUMBER = 14;
        public static final int KEYBOARD_FIELD_NUMBER = 21;
        public static final int KEYS_HIDDEN_FIELD_NUMBER = 20;
        public static final int LAYOUT_DIRECTION_FIELD_NUMBER = 4;
        public static final int LOCALE_FIELD_NUMBER = 3;
        public static final int MCC_FIELD_NUMBER = 1;
        public static final int MNC_FIELD_NUMBER = 2;
        public static final int NAVIGATION_FIELD_NUMBER = 23;
        public static final int NAV_HIDDEN_FIELD_NUMBER = 22;
        public static final int ORIENTATION_FIELD_NUMBER = 15;
        public static final int PRODUCT_FIELD_NUMBER = 25;
        public static final int SCREEN_HEIGHT_DP_FIELD_NUMBER = 8;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 6;
        public static final int SCREEN_LAYOUT_LONG_FIELD_NUMBER = 11;
        public static final int SCREEN_LAYOUT_SIZE_FIELD_NUMBER = 10;
        public static final int SCREEN_ROUND_FIELD_NUMBER = 12;
        public static final int SCREEN_WIDTH_DP_FIELD_NUMBER = 7;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 5;
        public static final int SDK_VERSION_FIELD_NUMBER = 24;
        public static final int SDK_VERSION_MINOR_FIELD_NUMBER = 27;
        public static final int SMALLEST_SCREEN_WIDTH_DP_FIELD_NUMBER = 9;
        public static final int TOUCHSCREEN_FIELD_NUMBER = 19;
        public static final int UI_MODE_NIGHT_FIELD_NUMBER = 17;
        public static final int UI_MODE_TYPE_FIELD_NUMBER = 16;
        public static final int WIDE_COLOR_GAMUT_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int density_;
        private int grammaticalGender_;
        private int hdr_;
        private int keyboard_;
        private int keysHidden_;
        private int layoutDirection_;
        private volatile Object locale_;
        private int mcc_;
        private byte memoizedIsInitialized;
        private int mnc_;
        private int navHidden_;
        private int navigation_;
        private int orientation_;
        private volatile Object product_;
        private int screenHeightDp_;
        private int screenHeight_;
        private int screenLayoutLong_;
        private int screenLayoutSize_;
        private int screenRound_;
        private int screenWidthDp_;
        private int screenWidth_;
        private int sdkVersionMinor_;
        private int sdkVersion_;
        private int smallestScreenWidthDp_;
        private int touchscreen_;
        private int uiModeNight_;
        private int uiModeType_;
        private int wideColorGamut_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final Parser<Configuration> PARSER = new AbstractParser<Configuration>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.1
            @Override // com.google.protobuf.Parser
            public Configuration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Configuration.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationOrBuilder {
            private int bitField0_;
            private int density_;
            private int grammaticalGender_;
            private int hdr_;
            private int keyboard_;
            private int keysHidden_;
            private int layoutDirection_;
            private Object locale_;
            private int mcc_;
            private int mnc_;
            private int navHidden_;
            private int navigation_;
            private int orientation_;
            private Object product_;
            private int screenHeightDp_;
            private int screenHeight_;
            private int screenLayoutLong_;
            private int screenLayoutSize_;
            private int screenRound_;
            private int screenWidthDp_;
            private int screenWidth_;
            private int sdkVersionMinor_;
            private int sdkVersion_;
            private int smallestScreenWidthDp_;
            private int touchscreen_;
            private int uiModeNight_;
            private int uiModeType_;
            private int wideColorGamut_;

            public /* synthetic */ Builder(int i10) {
                this();
            }

            private void buildPartial0(Configuration configuration) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    configuration.mcc_ = this.mcc_;
                }
                if ((i10 & 2) != 0) {
                    configuration.mnc_ = this.mnc_;
                }
                if ((i10 & 4) != 0) {
                    configuration.locale_ = this.locale_;
                }
                if ((i10 & 8) != 0) {
                    configuration.layoutDirection_ = this.layoutDirection_;
                }
                if ((i10 & 16) != 0) {
                    configuration.screenWidth_ = this.screenWidth_;
                }
                if ((i10 & 32) != 0) {
                    configuration.screenHeight_ = this.screenHeight_;
                }
                if ((i10 & 64) != 0) {
                    configuration.screenWidthDp_ = this.screenWidthDp_;
                }
                if ((i10 & 128) != 0) {
                    configuration.screenHeightDp_ = this.screenHeightDp_;
                }
                if ((i10 & 256) != 0) {
                    configuration.smallestScreenWidthDp_ = this.smallestScreenWidthDp_;
                }
                if ((i10 & 512) != 0) {
                    configuration.screenLayoutSize_ = this.screenLayoutSize_;
                }
                if ((i10 & 1024) != 0) {
                    configuration.screenLayoutLong_ = this.screenLayoutLong_;
                }
                if ((i10 & 2048) != 0) {
                    configuration.screenRound_ = this.screenRound_;
                }
                if ((i10 & 4096) != 0) {
                    configuration.wideColorGamut_ = this.wideColorGamut_;
                }
                if ((i10 & 8192) != 0) {
                    configuration.hdr_ = this.hdr_;
                }
                if ((i10 & 16384) != 0) {
                    configuration.orientation_ = this.orientation_;
                }
                if ((32768 & i10) != 0) {
                    configuration.uiModeType_ = this.uiModeType_;
                }
                if ((65536 & i10) != 0) {
                    configuration.uiModeNight_ = this.uiModeNight_;
                }
                if ((131072 & i10) != 0) {
                    configuration.density_ = this.density_;
                }
                if ((262144 & i10) != 0) {
                    configuration.touchscreen_ = this.touchscreen_;
                }
                if ((524288 & i10) != 0) {
                    configuration.keysHidden_ = this.keysHidden_;
                }
                if ((1048576 & i10) != 0) {
                    configuration.keyboard_ = this.keyboard_;
                }
                if ((2097152 & i10) != 0) {
                    configuration.navHidden_ = this.navHidden_;
                }
                if ((4194304 & i10) != 0) {
                    configuration.navigation_ = this.navigation_;
                }
                if ((8388608 & i10) != 0) {
                    configuration.sdkVersion_ = this.sdkVersion_;
                }
                if ((16777216 & i10) != 0) {
                    configuration.sdkVersionMinor_ = this.sdkVersionMinor_;
                }
                if ((33554432 & i10) != 0) {
                    configuration.grammaticalGender_ = this.grammaticalGender_;
                }
                if ((i10 & 67108864) != 0) {
                    configuration.product_ = this.product_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_descriptor;
            }

            public Builder clearDensity() {
                this.bitField0_ &= -131073;
                this.density_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGrammaticalGender() {
                this.bitField0_ &= -33554433;
                this.grammaticalGender_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHdr() {
                this.bitField0_ &= -8193;
                this.hdr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearKeyboard() {
                this.bitField0_ &= -1048577;
                this.keyboard_ = 0;
                onChanged();
                return this;
            }

            public Builder clearKeysHidden() {
                this.bitField0_ &= -524289;
                this.keysHidden_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLayoutDirection() {
                this.bitField0_ &= -9;
                this.layoutDirection_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLocale() {
                this.locale_ = Configuration.getDefaultInstance().getLocale();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearMcc() {
                this.bitField0_ &= -2;
                this.mcc_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMnc() {
                this.bitField0_ &= -3;
                this.mnc_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNavHidden() {
                this.bitField0_ &= -2097153;
                this.navHidden_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNavigation() {
                this.bitField0_ &= -4194305;
                this.navigation_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOrientation() {
                this.bitField0_ &= -16385;
                this.orientation_ = 0;
                onChanged();
                return this;
            }

            public Builder clearProduct() {
                this.product_ = Configuration.getDefaultInstance().getProduct();
                this.bitField0_ &= -67108865;
                onChanged();
                return this;
            }

            public Builder clearScreenHeight() {
                this.bitField0_ &= -33;
                this.screenHeight_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenHeightDp() {
                this.bitField0_ &= -129;
                this.screenHeightDp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenLayoutLong() {
                this.bitField0_ &= -1025;
                this.screenLayoutLong_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenLayoutSize() {
                this.bitField0_ &= -513;
                this.screenLayoutSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenRound() {
                this.bitField0_ &= -2049;
                this.screenRound_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenWidth() {
                this.bitField0_ &= -17;
                this.screenWidth_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenWidthDp() {
                this.bitField0_ &= -65;
                this.screenWidthDp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSdkVersion() {
                this.bitField0_ &= -8388609;
                this.sdkVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSdkVersionMinor() {
                this.bitField0_ &= -16777217;
                this.sdkVersionMinor_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSmallestScreenWidthDp() {
                this.bitField0_ &= -257;
                this.smallestScreenWidthDp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTouchscreen() {
                this.bitField0_ &= -262145;
                this.touchscreen_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUiModeNight() {
                this.bitField0_ &= -65537;
                this.uiModeNight_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUiModeType() {
                this.bitField0_ &= -32769;
                this.uiModeType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWideColorGamut() {
                this.bitField0_ &= -4097;
                this.wideColorGamut_ = 0;
                onChanged();
                return this;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getDensity() {
                return this.density_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_descriptor;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public GrammaticalGender getGrammaticalGender() {
                GrammaticalGender grammaticalGenderForNumber = GrammaticalGender.forNumber(this.grammaticalGender_);
                return grammaticalGenderForNumber == null ? GrammaticalGender.UNRECOGNIZED : grammaticalGenderForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getGrammaticalGenderValue() {
                return this.grammaticalGender_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public Hdr getHdr() {
                Hdr hdrForNumber = Hdr.forNumber(this.hdr_);
                return hdrForNumber == null ? Hdr.UNRECOGNIZED : hdrForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getHdrValue() {
                return this.hdr_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public Keyboard getKeyboard() {
                Keyboard keyboardForNumber = Keyboard.forNumber(this.keyboard_);
                return keyboardForNumber == null ? Keyboard.UNRECOGNIZED : keyboardForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getKeyboardValue() {
                return this.keyboard_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public KeysHidden getKeysHidden() {
                KeysHidden keysHiddenForNumber = KeysHidden.forNumber(this.keysHidden_);
                return keysHiddenForNumber == null ? KeysHidden.UNRECOGNIZED : keysHiddenForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getKeysHiddenValue() {
                return this.keysHidden_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public LayoutDirection getLayoutDirection() {
                LayoutDirection layoutDirectionForNumber = LayoutDirection.forNumber(this.layoutDirection_);
                return layoutDirectionForNumber == null ? LayoutDirection.UNRECOGNIZED : layoutDirectionForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getLayoutDirectionValue() {
                return this.layoutDirection_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public String getLocale() {
                Object obj = this.locale_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.locale_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public ByteString getLocaleBytes() {
                Object obj = this.locale_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locale_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getMcc() {
                return this.mcc_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getMnc() {
                return this.mnc_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public NavHidden getNavHidden() {
                NavHidden navHiddenForNumber = NavHidden.forNumber(this.navHidden_);
                return navHiddenForNumber == null ? NavHidden.UNRECOGNIZED : navHiddenForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getNavHiddenValue() {
                return this.navHidden_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public Navigation getNavigation() {
                Navigation navigationForNumber = Navigation.forNumber(this.navigation_);
                return navigationForNumber == null ? Navigation.UNRECOGNIZED : navigationForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getNavigationValue() {
                return this.navigation_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public Orientation getOrientation() {
                Orientation orientationForNumber = Orientation.forNumber(this.orientation_);
                return orientationForNumber == null ? Orientation.UNRECOGNIZED : orientationForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getOrientationValue() {
                return this.orientation_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public String getProduct() {
                Object obj = this.product_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.product_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public ByteString getProductBytes() {
                Object obj = this.product_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.product_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getScreenHeight() {
                return this.screenHeight_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getScreenHeightDp() {
                return this.screenHeightDp_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public ScreenLayoutLong getScreenLayoutLong() {
                ScreenLayoutLong screenLayoutLongForNumber = ScreenLayoutLong.forNumber(this.screenLayoutLong_);
                return screenLayoutLongForNumber == null ? ScreenLayoutLong.UNRECOGNIZED : screenLayoutLongForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getScreenLayoutLongValue() {
                return this.screenLayoutLong_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public ScreenLayoutSize getScreenLayoutSize() {
                ScreenLayoutSize screenLayoutSizeForNumber = ScreenLayoutSize.forNumber(this.screenLayoutSize_);
                return screenLayoutSizeForNumber == null ? ScreenLayoutSize.UNRECOGNIZED : screenLayoutSizeForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getScreenLayoutSizeValue() {
                return this.screenLayoutSize_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public ScreenRound getScreenRound() {
                ScreenRound screenRoundForNumber = ScreenRound.forNumber(this.screenRound_);
                return screenRoundForNumber == null ? ScreenRound.UNRECOGNIZED : screenRoundForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getScreenRoundValue() {
                return this.screenRound_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getScreenWidth() {
                return this.screenWidth_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getScreenWidthDp() {
                return this.screenWidthDp_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getSdkVersion() {
                return this.sdkVersion_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getSdkVersionMinor() {
                return this.sdkVersionMinor_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getSmallestScreenWidthDp() {
                return this.smallestScreenWidthDp_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public Touchscreen getTouchscreen() {
                Touchscreen touchscreenForNumber = Touchscreen.forNumber(this.touchscreen_);
                return touchscreenForNumber == null ? Touchscreen.UNRECOGNIZED : touchscreenForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getTouchscreenValue() {
                return this.touchscreen_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public UiModeNight getUiModeNight() {
                UiModeNight uiModeNightForNumber = UiModeNight.forNumber(this.uiModeNight_);
                return uiModeNightForNumber == null ? UiModeNight.UNRECOGNIZED : uiModeNightForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getUiModeNightValue() {
                return this.uiModeNight_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public UiModeType getUiModeType() {
                UiModeType uiModeTypeForNumber = UiModeType.forNumber(this.uiModeType_);
                return uiModeTypeForNumber == null ? UiModeType.UNRECOGNIZED : uiModeTypeForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getUiModeTypeValue() {
                return this.uiModeType_;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public WideColorGamut getWideColorGamut() {
                WideColorGamut wideColorGamutForNumber = WideColorGamut.forNumber(this.wideColorGamut_);
                return wideColorGamutForNumber == null ? WideColorGamut.UNRECOGNIZED : wideColorGamutForNumber;
            }

            @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
            public int getWideColorGamutValue() {
                return this.wideColorGamut_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDensity(int i10) {
                this.density_ = i10;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setGrammaticalGender(GrammaticalGender grammaticalGender) {
                grammaticalGender.getClass();
                this.bitField0_ |= 33554432;
                this.grammaticalGender_ = grammaticalGender.getNumber();
                onChanged();
                return this;
            }

            public Builder setGrammaticalGenderValue(int i10) {
                this.grammaticalGender_ = i10;
                this.bitField0_ |= 33554432;
                onChanged();
                return this;
            }

            public Builder setHdr(Hdr hdr) {
                hdr.getClass();
                this.bitField0_ |= 8192;
                this.hdr_ = hdr.getNumber();
                onChanged();
                return this;
            }

            public Builder setHdrValue(int i10) {
                this.hdr_ = i10;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setKeyboard(Keyboard keyboard) {
                keyboard.getClass();
                this.bitField0_ |= PKIFailureInfo.badCertTemplate;
                this.keyboard_ = keyboard.getNumber();
                onChanged();
                return this;
            }

            public Builder setKeyboardValue(int i10) {
                this.keyboard_ = i10;
                this.bitField0_ |= PKIFailureInfo.badCertTemplate;
                onChanged();
                return this;
            }

            public Builder setKeysHidden(KeysHidden keysHidden) {
                keysHidden.getClass();
                this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
                this.keysHidden_ = keysHidden.getNumber();
                onChanged();
                return this;
            }

            public Builder setKeysHiddenValue(int i10) {
                this.keysHidden_ = i10;
                this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
                onChanged();
                return this;
            }

            public Builder setLayoutDirection(LayoutDirection layoutDirection) {
                layoutDirection.getClass();
                this.bitField0_ |= 8;
                this.layoutDirection_ = layoutDirection.getNumber();
                onChanged();
                return this;
            }

            public Builder setLayoutDirectionValue(int i10) {
                this.layoutDirection_ = i10;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLocale(String str) {
                str.getClass();
                this.locale_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLocaleBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.locale_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMcc(int i10) {
                this.mcc_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMnc(int i10) {
                this.mnc_ = i10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNavHidden(NavHidden navHidden) {
                navHidden.getClass();
                this.bitField0_ |= PKIFailureInfo.badSenderNonce;
                this.navHidden_ = navHidden.getNumber();
                onChanged();
                return this;
            }

            public Builder setNavHiddenValue(int i10) {
                this.navHidden_ = i10;
                this.bitField0_ |= PKIFailureInfo.badSenderNonce;
                onChanged();
                return this;
            }

            public Builder setNavigation(Navigation navigation) {
                navigation.getClass();
                this.bitField0_ |= 4194304;
                this.navigation_ = navigation.getNumber();
                onChanged();
                return this;
            }

            public Builder setNavigationValue(int i10) {
                this.navigation_ = i10;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setOrientation(Orientation orientation) {
                orientation.getClass();
                this.bitField0_ |= 16384;
                this.orientation_ = orientation.getNumber();
                onChanged();
                return this;
            }

            public Builder setOrientationValue(int i10) {
                this.orientation_ = i10;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setProduct(String str) {
                str.getClass();
                this.product_ = str;
                this.bitField0_ |= 67108864;
                onChanged();
                return this;
            }

            public Builder setProductBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.product_ = byteString;
                this.bitField0_ |= 67108864;
                onChanged();
                return this;
            }

            public Builder setScreenHeight(int i10) {
                this.screenHeight_ = i10;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setScreenHeightDp(int i10) {
                this.screenHeightDp_ = i10;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setScreenLayoutLong(ScreenLayoutLong screenLayoutLong) {
                screenLayoutLong.getClass();
                this.bitField0_ |= 1024;
                this.screenLayoutLong_ = screenLayoutLong.getNumber();
                onChanged();
                return this;
            }

            public Builder setScreenLayoutLongValue(int i10) {
                this.screenLayoutLong_ = i10;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setScreenLayoutSize(ScreenLayoutSize screenLayoutSize) {
                screenLayoutSize.getClass();
                this.bitField0_ |= 512;
                this.screenLayoutSize_ = screenLayoutSize.getNumber();
                onChanged();
                return this;
            }

            public Builder setScreenLayoutSizeValue(int i10) {
                this.screenLayoutSize_ = i10;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setScreenRound(ScreenRound screenRound) {
                screenRound.getClass();
                this.bitField0_ |= 2048;
                this.screenRound_ = screenRound.getNumber();
                onChanged();
                return this;
            }

            public Builder setScreenRoundValue(int i10) {
                this.screenRound_ = i10;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setScreenWidth(int i10) {
                this.screenWidth_ = i10;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setScreenWidthDp(int i10) {
                this.screenWidthDp_ = i10;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSdkVersion(int i10) {
                this.sdkVersion_ = i10;
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setSdkVersionMinor(int i10) {
                this.sdkVersionMinor_ = i10;
                this.bitField0_ |= 16777216;
                onChanged();
                return this;
            }

            public Builder setSmallestScreenWidthDp(int i10) {
                this.smallestScreenWidthDp_ = i10;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTouchscreen(Touchscreen touchscreen) {
                touchscreen.getClass();
                this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
                this.touchscreen_ = touchscreen.getNumber();
                onChanged();
                return this;
            }

            public Builder setTouchscreenValue(int i10) {
                this.touchscreen_ = i10;
                this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
                onChanged();
                return this;
            }

            public Builder setUiModeNight(UiModeNight uiModeNight) {
                uiModeNight.getClass();
                this.bitField0_ |= 65536;
                this.uiModeNight_ = uiModeNight.getNumber();
                onChanged();
                return this;
            }

            public Builder setUiModeNightValue(int i10) {
                this.uiModeNight_ = i10;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setUiModeType(UiModeType uiModeType) {
                uiModeType.getClass();
                this.bitField0_ |= 32768;
                this.uiModeType_ = uiModeType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUiModeTypeValue(int i10) {
                this.uiModeType_ = i10;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setWideColorGamut(WideColorGamut wideColorGamut) {
                wideColorGamut.getClass();
                this.bitField0_ |= 4096;
                this.wideColorGamut_ = wideColorGamut.getNumber();
                onChanged();
                return this;
            }

            public Builder setWideColorGamutValue(int i10) {
                this.wideColorGamut_ = i10;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i10) {
                this(builderParent);
            }

            private Builder() {
                this.locale_ = "";
                this.layoutDirection_ = 0;
                this.screenLayoutSize_ = 0;
                this.screenLayoutLong_ = 0;
                this.screenRound_ = 0;
                this.wideColorGamut_ = 0;
                this.hdr_ = 0;
                this.orientation_ = 0;
                this.uiModeType_ = 0;
                this.uiModeNight_ = 0;
                this.touchscreen_ = 0;
                this.keysHidden_ = 0;
                this.keyboard_ = 0;
                this.navHidden_ = 0;
                this.navigation_ = 0;
                this.grammaticalGender_ = 0;
                this.product_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Configuration build() {
                Configuration configurationBuildPartial = buildPartial();
                if (configurationBuildPartial.isInitialized()) {
                    return configurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configuration);
                }
                onBuilt();
                return configuration;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mcc_ = 0;
                this.mnc_ = 0;
                this.locale_ = "";
                this.layoutDirection_ = 0;
                this.screenWidth_ = 0;
                this.screenHeight_ = 0;
                this.screenWidthDp_ = 0;
                this.screenHeightDp_ = 0;
                this.smallestScreenWidthDp_ = 0;
                this.screenLayoutSize_ = 0;
                this.screenLayoutLong_ = 0;
                this.screenRound_ = 0;
                this.wideColorGamut_ = 0;
                this.hdr_ = 0;
                this.orientation_ = 0;
                this.uiModeType_ = 0;
                this.uiModeNight_ = 0;
                this.density_ = 0;
                this.touchscreen_ = 0;
                this.keysHidden_ = 0;
                this.keyboard_ = 0;
                this.navHidden_ = 0;
                this.navigation_ = 0;
                this.sdkVersion_ = 0;
                this.sdkVersionMinor_ = 0;
                this.grammaticalGender_ = 0;
                this.product_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.getMcc() != 0) {
                    setMcc(configuration.getMcc());
                }
                if (configuration.getMnc() != 0) {
                    setMnc(configuration.getMnc());
                }
                if (!configuration.getLocale().isEmpty()) {
                    this.locale_ = configuration.locale_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (configuration.layoutDirection_ != 0) {
                    setLayoutDirectionValue(configuration.getLayoutDirectionValue());
                }
                if (configuration.getScreenWidth() != 0) {
                    setScreenWidth(configuration.getScreenWidth());
                }
                if (configuration.getScreenHeight() != 0) {
                    setScreenHeight(configuration.getScreenHeight());
                }
                if (configuration.getScreenWidthDp() != 0) {
                    setScreenWidthDp(configuration.getScreenWidthDp());
                }
                if (configuration.getScreenHeightDp() != 0) {
                    setScreenHeightDp(configuration.getScreenHeightDp());
                }
                if (configuration.getSmallestScreenWidthDp() != 0) {
                    setSmallestScreenWidthDp(configuration.getSmallestScreenWidthDp());
                }
                if (configuration.screenLayoutSize_ != 0) {
                    setScreenLayoutSizeValue(configuration.getScreenLayoutSizeValue());
                }
                if (configuration.screenLayoutLong_ != 0) {
                    setScreenLayoutLongValue(configuration.getScreenLayoutLongValue());
                }
                if (configuration.screenRound_ != 0) {
                    setScreenRoundValue(configuration.getScreenRoundValue());
                }
                if (configuration.wideColorGamut_ != 0) {
                    setWideColorGamutValue(configuration.getWideColorGamutValue());
                }
                if (configuration.hdr_ != 0) {
                    setHdrValue(configuration.getHdrValue());
                }
                if (configuration.orientation_ != 0) {
                    setOrientationValue(configuration.getOrientationValue());
                }
                if (configuration.uiModeType_ != 0) {
                    setUiModeTypeValue(configuration.getUiModeTypeValue());
                }
                if (configuration.uiModeNight_ != 0) {
                    setUiModeNightValue(configuration.getUiModeNightValue());
                }
                if (configuration.getDensity() != 0) {
                    setDensity(configuration.getDensity());
                }
                if (configuration.touchscreen_ != 0) {
                    setTouchscreenValue(configuration.getTouchscreenValue());
                }
                if (configuration.keysHidden_ != 0) {
                    setKeysHiddenValue(configuration.getKeysHiddenValue());
                }
                if (configuration.keyboard_ != 0) {
                    setKeyboardValue(configuration.getKeyboardValue());
                }
                if (configuration.navHidden_ != 0) {
                    setNavHiddenValue(configuration.getNavHiddenValue());
                }
                if (configuration.navigation_ != 0) {
                    setNavigationValue(configuration.getNavigationValue());
                }
                if (configuration.getSdkVersion() != 0) {
                    setSdkVersion(configuration.getSdkVersion());
                }
                if (configuration.getSdkVersionMinor() != 0) {
                    setSdkVersionMinor(configuration.getSdkVersionMinor());
                }
                if (configuration.grammaticalGender_ != 0) {
                    setGrammaticalGenderValue(configuration.getGrammaticalGenderValue());
                }
                if (!configuration.getProduct().isEmpty()) {
                    this.product_ = configuration.product_;
                    this.bitField0_ |= 67108864;
                    onChanged();
                }
                mergeUnknownFields(configuration.getUnknownFields());
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.locale_ = "";
                this.layoutDirection_ = 0;
                this.screenLayoutSize_ = 0;
                this.screenLayoutLong_ = 0;
                this.screenRound_ = 0;
                this.wideColorGamut_ = 0;
                this.hdr_ = 0;
                this.orientation_ = 0;
                this.uiModeType_ = 0;
                this.uiModeNight_ = 0;
                this.touchscreen_ = 0;
                this.keysHidden_ = 0;
                this.keyboard_ = 0;
                this.navHidden_ = 0;
                this.navigation_ = 0;
                this.grammaticalGender_ = 0;
                this.product_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.mcc_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                case 16:
                                    this.mnc_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                case 26:
                                    this.locale_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                case 32:
                                    this.layoutDirection_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 8;
                                case 40:
                                    this.screenWidth_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                case 48:
                                    this.screenHeight_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                case 56:
                                    this.screenWidthDp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                case 64:
                                    this.screenHeightDp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                case 72:
                                    this.smallestScreenWidthDp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                case 80:
                                    this.screenLayoutSize_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 512;
                                case HeaderItem.METHOD_COUNT_OFFSET /* 88 */:
                                    this.screenLayoutLong_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 1024;
                                case HeaderItem.CLASS_COUNT_OFFSET /* 96 */:
                                    this.screenRound_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 2048;
                                case HeaderItem.DATA_SIZE_OFFSET /* 104 */:
                                    this.wideColorGamut_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 4096;
                                case 112:
                                    this.hdr_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 8192;
                                case CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET /* 120 */:
                                    this.orientation_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 16384;
                                case 128:
                                    this.uiModeType_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 32768;
                                case 136:
                                    this.uiModeNight_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 65536;
                                case 144:
                                    this.density_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 131072;
                                case 152:
                                    this.touchscreen_ = codedInputStream.readEnum();
                                    this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
                                case 160:
                                    this.keysHidden_ = codedInputStream.readEnum();
                                    this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
                                case 168:
                                    this.keyboard_ = codedInputStream.readEnum();
                                    this.bitField0_ |= PKIFailureInfo.badCertTemplate;
                                case 176:
                                    this.navHidden_ = codedInputStream.readEnum();
                                    this.bitField0_ |= PKIFailureInfo.badSenderNonce;
                                case 184:
                                    this.navigation_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 4194304;
                                case 192:
                                    this.sdkVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8388608;
                                case 202:
                                    this.product_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 67108864;
                                case 208:
                                    this.grammaticalGender_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 33554432;
                                case 216:
                                    this.sdkVersionMinor_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16777216;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        z10 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.unwrapIOException();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        public enum GrammaticalGender implements ProtocolMessageEnum {
            GRAM_GENDER_USET(0),
            GRAM_GENDER_NEUTER(1),
            GRAM_GENDER_FEMININE(2),
            GRAM_GENDER_MASCULINE(3),
            UNRECOGNIZED(-1);

            public static final int GRAM_GENDER_FEMININE_VALUE = 2;
            public static final int GRAM_GENDER_MASCULINE_VALUE = 3;
            public static final int GRAM_GENDER_NEUTER_VALUE = 1;
            public static final int GRAM_GENDER_USET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<GrammaticalGender> internalValueMap = new Internal.EnumLiteMap<GrammaticalGender>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.GrammaticalGender.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GrammaticalGender findValueByNumber(int i10) {
                    return GrammaticalGender.forNumber(i10);
                }
            };
            private static final GrammaticalGender[] VALUES = values();

            GrammaticalGender(int i10) {
                this.value = i10;
            }

            public static GrammaticalGender forNumber(int i10) {
                if (i10 == 0) {
                    return GRAM_GENDER_USET;
                }
                if (i10 == 1) {
                    return GRAM_GENDER_NEUTER;
                }
                if (i10 == 2) {
                    return GRAM_GENDER_FEMININE;
                }
                if (i10 != 3) {
                    return null;
                }
                return GRAM_GENDER_MASCULINE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(14);
            }

            public static Internal.EnumLiteMap<GrammaticalGender> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static GrammaticalGender valueOf(int i10) {
                return forNumber(i10);
            }

            public static GrammaticalGender valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum Hdr implements ProtocolMessageEnum {
            HDR_UNSET(0),
            HDR_HIGHDR(1),
            HDR_LOWDR(2),
            UNRECOGNIZED(-1);

            public static final int HDR_HIGHDR_VALUE = 1;
            public static final int HDR_LOWDR_VALUE = 2;
            public static final int HDR_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Hdr> internalValueMap = new Internal.EnumLiteMap<Hdr>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.Hdr.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Hdr findValueByNumber(int i10) {
                    return Hdr.forNumber(i10);
                }
            };
            private static final Hdr[] VALUES = values();

            Hdr(int i10) {
                this.value = i10;
            }

            public static Hdr forNumber(int i10) {
                if (i10 == 0) {
                    return HDR_UNSET;
                }
                if (i10 == 1) {
                    return HDR_HIGHDR;
                }
                if (i10 != 2) {
                    return null;
                }
                return HDR_LOWDR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(5);
            }

            public static Internal.EnumLiteMap<Hdr> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Hdr valueOf(int i10) {
                return forNumber(i10);
            }

            public static Hdr valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum Keyboard implements ProtocolMessageEnum {
            KEYBOARD_UNSET(0),
            KEYBOARD_NOKEYS(1),
            KEYBOARD_QWERTY(2),
            KEYBOARD_TWELVEKEY(3),
            UNRECOGNIZED(-1);

            public static final int KEYBOARD_NOKEYS_VALUE = 1;
            public static final int KEYBOARD_QWERTY_VALUE = 2;
            public static final int KEYBOARD_TWELVEKEY_VALUE = 3;
            public static final int KEYBOARD_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Keyboard> internalValueMap = new Internal.EnumLiteMap<Keyboard>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.Keyboard.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Keyboard findValueByNumber(int i10) {
                    return Keyboard.forNumber(i10);
                }
            };
            private static final Keyboard[] VALUES = values();

            Keyboard(int i10) {
                this.value = i10;
            }

            public static Keyboard forNumber(int i10) {
                if (i10 == 0) {
                    return KEYBOARD_UNSET;
                }
                if (i10 == 1) {
                    return KEYBOARD_NOKEYS;
                }
                if (i10 == 2) {
                    return KEYBOARD_QWERTY;
                }
                if (i10 != 3) {
                    return null;
                }
                return KEYBOARD_TWELVEKEY;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(11);
            }

            public static Internal.EnumLiteMap<Keyboard> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Keyboard valueOf(int i10) {
                return forNumber(i10);
            }

            public static Keyboard valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum KeysHidden implements ProtocolMessageEnum {
            KEYS_HIDDEN_UNSET(0),
            KEYS_HIDDEN_KEYSEXPOSED(1),
            KEYS_HIDDEN_KEYSHIDDEN(2),
            KEYS_HIDDEN_KEYSSOFT(3),
            UNRECOGNIZED(-1);

            public static final int KEYS_HIDDEN_KEYSEXPOSED_VALUE = 1;
            public static final int KEYS_HIDDEN_KEYSHIDDEN_VALUE = 2;
            public static final int KEYS_HIDDEN_KEYSSOFT_VALUE = 3;
            public static final int KEYS_HIDDEN_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<KeysHidden> internalValueMap = new Internal.EnumLiteMap<KeysHidden>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.KeysHidden.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public KeysHidden findValueByNumber(int i10) {
                    return KeysHidden.forNumber(i10);
                }
            };
            private static final KeysHidden[] VALUES = values();

            KeysHidden(int i10) {
                this.value = i10;
            }

            public static KeysHidden forNumber(int i10) {
                if (i10 == 0) {
                    return KEYS_HIDDEN_UNSET;
                }
                if (i10 == 1) {
                    return KEYS_HIDDEN_KEYSEXPOSED;
                }
                if (i10 == 2) {
                    return KEYS_HIDDEN_KEYSHIDDEN;
                }
                if (i10 != 3) {
                    return null;
                }
                return KEYS_HIDDEN_KEYSSOFT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(10);
            }

            public static Internal.EnumLiteMap<KeysHidden> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static KeysHidden valueOf(int i10) {
                return forNumber(i10);
            }

            public static KeysHidden valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum LayoutDirection implements ProtocolMessageEnum {
            LAYOUT_DIRECTION_UNSET(0),
            LAYOUT_DIRECTION_LTR(1),
            LAYOUT_DIRECTION_RTL(2),
            UNRECOGNIZED(-1);

            public static final int LAYOUT_DIRECTION_LTR_VALUE = 1;
            public static final int LAYOUT_DIRECTION_RTL_VALUE = 2;
            public static final int LAYOUT_DIRECTION_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<LayoutDirection> internalValueMap = new Internal.EnumLiteMap<LayoutDirection>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.LayoutDirection.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public LayoutDirection findValueByNumber(int i10) {
                    return LayoutDirection.forNumber(i10);
                }
            };
            private static final LayoutDirection[] VALUES = values();

            LayoutDirection(int i10) {
                this.value = i10;
            }

            public static LayoutDirection forNumber(int i10) {
                if (i10 == 0) {
                    return LAYOUT_DIRECTION_UNSET;
                }
                if (i10 == 1) {
                    return LAYOUT_DIRECTION_LTR;
                }
                if (i10 != 2) {
                    return null;
                }
                return LAYOUT_DIRECTION_RTL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<LayoutDirection> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static LayoutDirection valueOf(int i10) {
                return forNumber(i10);
            }

            public static LayoutDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum NavHidden implements ProtocolMessageEnum {
            NAV_HIDDEN_UNSET(0),
            NAV_HIDDEN_NAVEXPOSED(1),
            NAV_HIDDEN_NAVHIDDEN(2),
            UNRECOGNIZED(-1);

            public static final int NAV_HIDDEN_NAVEXPOSED_VALUE = 1;
            public static final int NAV_HIDDEN_NAVHIDDEN_VALUE = 2;
            public static final int NAV_HIDDEN_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<NavHidden> internalValueMap = new Internal.EnumLiteMap<NavHidden>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.NavHidden.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public NavHidden findValueByNumber(int i10) {
                    return NavHidden.forNumber(i10);
                }
            };
            private static final NavHidden[] VALUES = values();

            NavHidden(int i10) {
                this.value = i10;
            }

            public static NavHidden forNumber(int i10) {
                if (i10 == 0) {
                    return NAV_HIDDEN_UNSET;
                }
                if (i10 == 1) {
                    return NAV_HIDDEN_NAVEXPOSED;
                }
                if (i10 != 2) {
                    return null;
                }
                return NAV_HIDDEN_NAVHIDDEN;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(12);
            }

            public static Internal.EnumLiteMap<NavHidden> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static NavHidden valueOf(int i10) {
                return forNumber(i10);
            }

            public static NavHidden valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum Navigation implements ProtocolMessageEnum {
            NAVIGATION_UNSET(0),
            NAVIGATION_NONAV(1),
            NAVIGATION_DPAD(2),
            NAVIGATION_TRACKBALL(3),
            NAVIGATION_WHEEL(4),
            UNRECOGNIZED(-1);

            public static final int NAVIGATION_DPAD_VALUE = 2;
            public static final int NAVIGATION_NONAV_VALUE = 1;
            public static final int NAVIGATION_TRACKBALL_VALUE = 3;
            public static final int NAVIGATION_UNSET_VALUE = 0;
            public static final int NAVIGATION_WHEEL_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<Navigation> internalValueMap = new Internal.EnumLiteMap<Navigation>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.Navigation.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Navigation findValueByNumber(int i10) {
                    return Navigation.forNumber(i10);
                }
            };
            private static final Navigation[] VALUES = values();

            Navigation(int i10) {
                this.value = i10;
            }

            public static Navigation forNumber(int i10) {
                if (i10 == 0) {
                    return NAVIGATION_UNSET;
                }
                if (i10 == 1) {
                    return NAVIGATION_NONAV;
                }
                if (i10 == 2) {
                    return NAVIGATION_DPAD;
                }
                if (i10 == 3) {
                    return NAVIGATION_TRACKBALL;
                }
                if (i10 != 4) {
                    return null;
                }
                return NAVIGATION_WHEEL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(13);
            }

            public static Internal.EnumLiteMap<Navigation> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Navigation valueOf(int i10) {
                return forNumber(i10);
            }

            public static Navigation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum Orientation implements ProtocolMessageEnum {
            ORIENTATION_UNSET(0),
            ORIENTATION_PORT(1),
            ORIENTATION_LAND(2),
            ORIENTATION_SQUARE(3),
            UNRECOGNIZED(-1);

            public static final int ORIENTATION_LAND_VALUE = 2;
            public static final int ORIENTATION_PORT_VALUE = 1;
            public static final int ORIENTATION_SQUARE_VALUE = 3;
            public static final int ORIENTATION_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Orientation> internalValueMap = new Internal.EnumLiteMap<Orientation>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.Orientation.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Orientation findValueByNumber(int i10) {
                    return Orientation.forNumber(i10);
                }
            };
            private static final Orientation[] VALUES = values();

            Orientation(int i10) {
                this.value = i10;
            }

            public static Orientation forNumber(int i10) {
                if (i10 == 0) {
                    return ORIENTATION_UNSET;
                }
                if (i10 == 1) {
                    return ORIENTATION_PORT;
                }
                if (i10 == 2) {
                    return ORIENTATION_LAND;
                }
                if (i10 != 3) {
                    return null;
                }
                return ORIENTATION_SQUARE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(6);
            }

            public static Internal.EnumLiteMap<Orientation> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Orientation valueOf(int i10) {
                return forNumber(i10);
            }

            public static Orientation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum ScreenLayoutLong implements ProtocolMessageEnum {
            SCREEN_LAYOUT_LONG_UNSET(0),
            SCREEN_LAYOUT_LONG_LONG(1),
            SCREEN_LAYOUT_LONG_NOTLONG(2),
            UNRECOGNIZED(-1);

            public static final int SCREEN_LAYOUT_LONG_LONG_VALUE = 1;
            public static final int SCREEN_LAYOUT_LONG_NOTLONG_VALUE = 2;
            public static final int SCREEN_LAYOUT_LONG_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ScreenLayoutLong> internalValueMap = new Internal.EnumLiteMap<ScreenLayoutLong>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.ScreenLayoutLong.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ScreenLayoutLong findValueByNumber(int i10) {
                    return ScreenLayoutLong.forNumber(i10);
                }
            };
            private static final ScreenLayoutLong[] VALUES = values();

            ScreenLayoutLong(int i10) {
                this.value = i10;
            }

            public static ScreenLayoutLong forNumber(int i10) {
                if (i10 == 0) {
                    return SCREEN_LAYOUT_LONG_UNSET;
                }
                if (i10 == 1) {
                    return SCREEN_LAYOUT_LONG_LONG;
                }
                if (i10 != 2) {
                    return null;
                }
                return SCREEN_LAYOUT_LONG_NOTLONG;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(2);
            }

            public static Internal.EnumLiteMap<ScreenLayoutLong> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static ScreenLayoutLong valueOf(int i10) {
                return forNumber(i10);
            }

            public static ScreenLayoutLong valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum ScreenLayoutSize implements ProtocolMessageEnum {
            SCREEN_LAYOUT_SIZE_UNSET(0),
            SCREEN_LAYOUT_SIZE_SMALL(1),
            SCREEN_LAYOUT_SIZE_NORMAL(2),
            SCREEN_LAYOUT_SIZE_LARGE(3),
            SCREEN_LAYOUT_SIZE_XLARGE(4),
            UNRECOGNIZED(-1);

            public static final int SCREEN_LAYOUT_SIZE_LARGE_VALUE = 3;
            public static final int SCREEN_LAYOUT_SIZE_NORMAL_VALUE = 2;
            public static final int SCREEN_LAYOUT_SIZE_SMALL_VALUE = 1;
            public static final int SCREEN_LAYOUT_SIZE_UNSET_VALUE = 0;
            public static final int SCREEN_LAYOUT_SIZE_XLARGE_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<ScreenLayoutSize> internalValueMap = new Internal.EnumLiteMap<ScreenLayoutSize>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.ScreenLayoutSize.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ScreenLayoutSize findValueByNumber(int i10) {
                    return ScreenLayoutSize.forNumber(i10);
                }
            };
            private static final ScreenLayoutSize[] VALUES = values();

            ScreenLayoutSize(int i10) {
                this.value = i10;
            }

            public static ScreenLayoutSize forNumber(int i10) {
                if (i10 == 0) {
                    return SCREEN_LAYOUT_SIZE_UNSET;
                }
                if (i10 == 1) {
                    return SCREEN_LAYOUT_SIZE_SMALL;
                }
                if (i10 == 2) {
                    return SCREEN_LAYOUT_SIZE_NORMAL;
                }
                if (i10 == 3) {
                    return SCREEN_LAYOUT_SIZE_LARGE;
                }
                if (i10 != 4) {
                    return null;
                }
                return SCREEN_LAYOUT_SIZE_XLARGE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<ScreenLayoutSize> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static ScreenLayoutSize valueOf(int i10) {
                return forNumber(i10);
            }

            public static ScreenLayoutSize valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum ScreenRound implements ProtocolMessageEnum {
            SCREEN_ROUND_UNSET(0),
            SCREEN_ROUND_ROUND(1),
            SCREEN_ROUND_NOTROUND(2),
            UNRECOGNIZED(-1);

            public static final int SCREEN_ROUND_NOTROUND_VALUE = 2;
            public static final int SCREEN_ROUND_ROUND_VALUE = 1;
            public static final int SCREEN_ROUND_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ScreenRound> internalValueMap = new Internal.EnumLiteMap<ScreenRound>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.ScreenRound.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ScreenRound findValueByNumber(int i10) {
                    return ScreenRound.forNumber(i10);
                }
            };
            private static final ScreenRound[] VALUES = values();

            ScreenRound(int i10) {
                this.value = i10;
            }

            public static ScreenRound forNumber(int i10) {
                if (i10 == 0) {
                    return SCREEN_ROUND_UNSET;
                }
                if (i10 == 1) {
                    return SCREEN_ROUND_ROUND;
                }
                if (i10 != 2) {
                    return null;
                }
                return SCREEN_ROUND_NOTROUND;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(3);
            }

            public static Internal.EnumLiteMap<ScreenRound> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static ScreenRound valueOf(int i10) {
                return forNumber(i10);
            }

            public static ScreenRound valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum Touchscreen implements ProtocolMessageEnum {
            TOUCHSCREEN_UNSET(0),
            TOUCHSCREEN_NOTOUCH(1),
            TOUCHSCREEN_STYLUS(2),
            TOUCHSCREEN_FINGER(3),
            UNRECOGNIZED(-1);

            public static final int TOUCHSCREEN_FINGER_VALUE = 3;
            public static final int TOUCHSCREEN_NOTOUCH_VALUE = 1;
            public static final int TOUCHSCREEN_STYLUS_VALUE = 2;
            public static final int TOUCHSCREEN_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Touchscreen> internalValueMap = new Internal.EnumLiteMap<Touchscreen>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.Touchscreen.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Touchscreen findValueByNumber(int i10) {
                    return Touchscreen.forNumber(i10);
                }
            };
            private static final Touchscreen[] VALUES = values();

            Touchscreen(int i10) {
                this.value = i10;
            }

            public static Touchscreen forNumber(int i10) {
                if (i10 == 0) {
                    return TOUCHSCREEN_UNSET;
                }
                if (i10 == 1) {
                    return TOUCHSCREEN_NOTOUCH;
                }
                if (i10 == 2) {
                    return TOUCHSCREEN_STYLUS;
                }
                if (i10 != 3) {
                    return null;
                }
                return TOUCHSCREEN_FINGER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(9);
            }

            public static Internal.EnumLiteMap<Touchscreen> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Touchscreen valueOf(int i10) {
                return forNumber(i10);
            }

            public static Touchscreen valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum UiModeNight implements ProtocolMessageEnum {
            UI_MODE_NIGHT_UNSET(0),
            UI_MODE_NIGHT_NIGHT(1),
            UI_MODE_NIGHT_NOTNIGHT(2),
            UNRECOGNIZED(-1);

            public static final int UI_MODE_NIGHT_NIGHT_VALUE = 1;
            public static final int UI_MODE_NIGHT_NOTNIGHT_VALUE = 2;
            public static final int UI_MODE_NIGHT_UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<UiModeNight> internalValueMap = new Internal.EnumLiteMap<UiModeNight>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.UiModeNight.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public UiModeNight findValueByNumber(int i10) {
                    return UiModeNight.forNumber(i10);
                }
            };
            private static final UiModeNight[] VALUES = values();

            UiModeNight(int i10) {
                this.value = i10;
            }

            public static UiModeNight forNumber(int i10) {
                if (i10 == 0) {
                    return UI_MODE_NIGHT_UNSET;
                }
                if (i10 == 1) {
                    return UI_MODE_NIGHT_NIGHT;
                }
                if (i10 != 2) {
                    return null;
                }
                return UI_MODE_NIGHT_NOTNIGHT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(8);
            }

            public static Internal.EnumLiteMap<UiModeNight> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static UiModeNight valueOf(int i10) {
                return forNumber(i10);
            }

            public static UiModeNight valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum UiModeType implements ProtocolMessageEnum {
            UI_MODE_TYPE_UNSET(0),
            UI_MODE_TYPE_NORMAL(1),
            UI_MODE_TYPE_DESK(2),
            UI_MODE_TYPE_CAR(3),
            UI_MODE_TYPE_TELEVISION(4),
            UI_MODE_TYPE_APPLIANCE(5),
            UI_MODE_TYPE_WATCH(6),
            UI_MODE_TYPE_VRHEADSET(7),
            UNRECOGNIZED(-1);

            public static final int UI_MODE_TYPE_APPLIANCE_VALUE = 5;
            public static final int UI_MODE_TYPE_CAR_VALUE = 3;
            public static final int UI_MODE_TYPE_DESK_VALUE = 2;
            public static final int UI_MODE_TYPE_NORMAL_VALUE = 1;
            public static final int UI_MODE_TYPE_TELEVISION_VALUE = 4;
            public static final int UI_MODE_TYPE_UNSET_VALUE = 0;
            public static final int UI_MODE_TYPE_VRHEADSET_VALUE = 7;
            public static final int UI_MODE_TYPE_WATCH_VALUE = 6;
            private final int value;
            private static final Internal.EnumLiteMap<UiModeType> internalValueMap = new Internal.EnumLiteMap<UiModeType>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.UiModeType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public UiModeType findValueByNumber(int i10) {
                    return UiModeType.forNumber(i10);
                }
            };
            private static final UiModeType[] VALUES = values();

            UiModeType(int i10) {
                this.value = i10;
            }

            public static UiModeType forNumber(int i10) {
                switch (i10) {
                    case 0:
                        return UI_MODE_TYPE_UNSET;
                    case 1:
                        return UI_MODE_TYPE_NORMAL;
                    case 2:
                        return UI_MODE_TYPE_DESK;
                    case 3:
                        return UI_MODE_TYPE_CAR;
                    case 4:
                        return UI_MODE_TYPE_TELEVISION;
                    case 5:
                        return UI_MODE_TYPE_APPLIANCE;
                    case 6:
                        return UI_MODE_TYPE_WATCH;
                    case 7:
                        return UI_MODE_TYPE_VRHEADSET;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(7);
            }

            public static Internal.EnumLiteMap<UiModeType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static UiModeType valueOf(int i10) {
                return forNumber(i10);
            }

            public static UiModeType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum WideColorGamut implements ProtocolMessageEnum {
            WIDE_COLOR_GAMUT_UNSET(0),
            WIDE_COLOR_GAMUT_WIDECG(1),
            WIDE_COLOR_GAMUT_NOWIDECG(2),
            UNRECOGNIZED(-1);

            public static final int WIDE_COLOR_GAMUT_NOWIDECG_VALUE = 2;
            public static final int WIDE_COLOR_GAMUT_UNSET_VALUE = 0;
            public static final int WIDE_COLOR_GAMUT_WIDECG_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<WideColorGamut> internalValueMap = new Internal.EnumLiteMap<WideColorGamut>() { // from class: com.android.aapt.ConfigurationOuterClass.Configuration.WideColorGamut.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public WideColorGamut findValueByNumber(int i10) {
                    return WideColorGamut.forNumber(i10);
                }
            };
            private static final WideColorGamut[] VALUES = values();

            WideColorGamut(int i10) {
                this.value = i10;
            }

            public static WideColorGamut forNumber(int i10) {
                if (i10 == 0) {
                    return WIDE_COLOR_GAMUT_UNSET;
                }
                if (i10 == 1) {
                    return WIDE_COLOR_GAMUT_WIDECG;
                }
                if (i10 != 2) {
                    return null;
                }
                return WIDE_COLOR_GAMUT_NOWIDECG;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(4);
            }

            public static Internal.EnumLiteMap<WideColorGamut> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static WideColorGamut valueOf(int i10) {
                return forNumber(i10);
            }

            public static WideColorGamut valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    if (enumValueDescriptor.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public /* synthetic */ Configuration(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Configuration> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            return getMcc() == configuration.getMcc() && getMnc() == configuration.getMnc() && getLocale().equals(configuration.getLocale()) && this.layoutDirection_ == configuration.layoutDirection_ && getScreenWidth() == configuration.getScreenWidth() && getScreenHeight() == configuration.getScreenHeight() && getScreenWidthDp() == configuration.getScreenWidthDp() && getScreenHeightDp() == configuration.getScreenHeightDp() && getSmallestScreenWidthDp() == configuration.getSmallestScreenWidthDp() && this.screenLayoutSize_ == configuration.screenLayoutSize_ && this.screenLayoutLong_ == configuration.screenLayoutLong_ && this.screenRound_ == configuration.screenRound_ && this.wideColorGamut_ == configuration.wideColorGamut_ && this.hdr_ == configuration.hdr_ && this.orientation_ == configuration.orientation_ && this.uiModeType_ == configuration.uiModeType_ && this.uiModeNight_ == configuration.uiModeNight_ && getDensity() == configuration.getDensity() && this.touchscreen_ == configuration.touchscreen_ && this.keysHidden_ == configuration.keysHidden_ && this.keyboard_ == configuration.keyboard_ && this.navHidden_ == configuration.navHidden_ && this.navigation_ == configuration.navigation_ && getSdkVersion() == configuration.getSdkVersion() && getSdkVersionMinor() == configuration.getSdkVersionMinor() && this.grammaticalGender_ == configuration.grammaticalGender_ && getProduct().equals(configuration.getProduct()) && getUnknownFields().equals(configuration.getUnknownFields());
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getDensity() {
            return this.density_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public GrammaticalGender getGrammaticalGender() {
            GrammaticalGender grammaticalGenderForNumber = GrammaticalGender.forNumber(this.grammaticalGender_);
            return grammaticalGenderForNumber == null ? GrammaticalGender.UNRECOGNIZED : grammaticalGenderForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getGrammaticalGenderValue() {
            return this.grammaticalGender_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public Hdr getHdr() {
            Hdr hdrForNumber = Hdr.forNumber(this.hdr_);
            return hdrForNumber == null ? Hdr.UNRECOGNIZED : hdrForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getHdrValue() {
            return this.hdr_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public Keyboard getKeyboard() {
            Keyboard keyboardForNumber = Keyboard.forNumber(this.keyboard_);
            return keyboardForNumber == null ? Keyboard.UNRECOGNIZED : keyboardForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getKeyboardValue() {
            return this.keyboard_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public KeysHidden getKeysHidden() {
            KeysHidden keysHiddenForNumber = KeysHidden.forNumber(this.keysHidden_);
            return keysHiddenForNumber == null ? KeysHidden.UNRECOGNIZED : keysHiddenForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getKeysHiddenValue() {
            return this.keysHidden_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public LayoutDirection getLayoutDirection() {
            LayoutDirection layoutDirectionForNumber = LayoutDirection.forNumber(this.layoutDirection_);
            return layoutDirectionForNumber == null ? LayoutDirection.UNRECOGNIZED : layoutDirectionForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getLayoutDirectionValue() {
            return this.layoutDirection_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public String getLocale() {
            Object obj = this.locale_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.locale_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public ByteString getLocaleBytes() {
            Object obj = this.locale_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locale_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getMcc() {
            return this.mcc_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getMnc() {
            return this.mnc_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public NavHidden getNavHidden() {
            NavHidden navHiddenForNumber = NavHidden.forNumber(this.navHidden_);
            return navHiddenForNumber == null ? NavHidden.UNRECOGNIZED : navHiddenForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getNavHiddenValue() {
            return this.navHidden_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public Navigation getNavigation() {
            Navigation navigationForNumber = Navigation.forNumber(this.navigation_);
            return navigationForNumber == null ? Navigation.UNRECOGNIZED : navigationForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getNavigationValue() {
            return this.navigation_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public Orientation getOrientation() {
            Orientation orientationForNumber = Orientation.forNumber(this.orientation_);
            return orientationForNumber == null ? Orientation.UNRECOGNIZED : orientationForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getOrientationValue() {
            return this.orientation_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Configuration> getParserForType() {
            return PARSER;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public String getProduct() {
            Object obj = this.product_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.product_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public ByteString getProductBytes() {
            Object obj = this.product_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.product_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getScreenHeightDp() {
            return this.screenHeightDp_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public ScreenLayoutLong getScreenLayoutLong() {
            ScreenLayoutLong screenLayoutLongForNumber = ScreenLayoutLong.forNumber(this.screenLayoutLong_);
            return screenLayoutLongForNumber == null ? ScreenLayoutLong.UNRECOGNIZED : screenLayoutLongForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getScreenLayoutLongValue() {
            return this.screenLayoutLong_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public ScreenLayoutSize getScreenLayoutSize() {
            ScreenLayoutSize screenLayoutSizeForNumber = ScreenLayoutSize.forNumber(this.screenLayoutSize_);
            return screenLayoutSizeForNumber == null ? ScreenLayoutSize.UNRECOGNIZED : screenLayoutSizeForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getScreenLayoutSizeValue() {
            return this.screenLayoutSize_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public ScreenRound getScreenRound() {
            ScreenRound screenRoundForNumber = ScreenRound.forNumber(this.screenRound_);
            return screenRoundForNumber == null ? ScreenRound.UNRECOGNIZED : screenRoundForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getScreenRoundValue() {
            return this.screenRound_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getScreenWidthDp() {
            return this.screenWidthDp_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getSdkVersionMinor() {
            return this.sdkVersionMinor_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.mcc_;
            int iComputeUInt32Size = i11 != 0 ? CodedOutputStream.computeUInt32Size(1, i11) : 0;
            int i12 = this.mnc_;
            if (i12 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, i12);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.locale_)) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(3, this.locale_);
            }
            if (this.layoutDirection_ != LayoutDirection.LAYOUT_DIRECTION_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(4, this.layoutDirection_);
            }
            int i13 = this.screenWidth_;
            if (i13 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, i13);
            }
            int i14 = this.screenHeight_;
            if (i14 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, i14);
            }
            int i15 = this.screenWidthDp_;
            if (i15 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, i15);
            }
            int i16 = this.screenHeightDp_;
            if (i16 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, i16);
            }
            int i17 = this.smallestScreenWidthDp_;
            if (i17 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(9, i17);
            }
            if (this.screenLayoutSize_ != ScreenLayoutSize.SCREEN_LAYOUT_SIZE_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(10, this.screenLayoutSize_);
            }
            if (this.screenLayoutLong_ != ScreenLayoutLong.SCREEN_LAYOUT_LONG_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(11, this.screenLayoutLong_);
            }
            if (this.screenRound_ != ScreenRound.SCREEN_ROUND_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(12, this.screenRound_);
            }
            if (this.wideColorGamut_ != WideColorGamut.WIDE_COLOR_GAMUT_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(13, this.wideColorGamut_);
            }
            if (this.hdr_ != Hdr.HDR_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(14, this.hdr_);
            }
            if (this.orientation_ != Orientation.ORIENTATION_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(15, this.orientation_);
            }
            if (this.uiModeType_ != UiModeType.UI_MODE_TYPE_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(16, this.uiModeType_);
            }
            if (this.uiModeNight_ != UiModeNight.UI_MODE_NIGHT_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(17, this.uiModeNight_);
            }
            int i18 = this.density_;
            if (i18 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(18, i18);
            }
            if (this.touchscreen_ != Touchscreen.TOUCHSCREEN_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(19, this.touchscreen_);
            }
            if (this.keysHidden_ != KeysHidden.KEYS_HIDDEN_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(20, this.keysHidden_);
            }
            if (this.keyboard_ != Keyboard.KEYBOARD_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(21, this.keyboard_);
            }
            if (this.navHidden_ != NavHidden.NAV_HIDDEN_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(22, this.navHidden_);
            }
            if (this.navigation_ != Navigation.NAVIGATION_UNSET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(23, this.navigation_);
            }
            int i19 = this.sdkVersion_;
            if (i19 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(24, i19);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.product_)) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(25, this.product_);
            }
            if (this.grammaticalGender_ != GrammaticalGender.GRAM_GENDER_USET.getNumber()) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(26, this.grammaticalGender_);
            }
            int i20 = this.sdkVersionMinor_;
            if (i20 != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(27, i20);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getSmallestScreenWidthDp() {
            return this.smallestScreenWidthDp_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public Touchscreen getTouchscreen() {
            Touchscreen touchscreenForNumber = Touchscreen.forNumber(this.touchscreen_);
            return touchscreenForNumber == null ? Touchscreen.UNRECOGNIZED : touchscreenForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getTouchscreenValue() {
            return this.touchscreen_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public UiModeNight getUiModeNight() {
            UiModeNight uiModeNightForNumber = UiModeNight.forNumber(this.uiModeNight_);
            return uiModeNightForNumber == null ? UiModeNight.UNRECOGNIZED : uiModeNightForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getUiModeNightValue() {
            return this.uiModeNight_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public UiModeType getUiModeType() {
            UiModeType uiModeTypeForNumber = UiModeType.forNumber(this.uiModeType_);
            return uiModeTypeForNumber == null ? UiModeType.UNRECOGNIZED : uiModeTypeForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getUiModeTypeValue() {
            return this.uiModeType_;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public WideColorGamut getWideColorGamut() {
            WideColorGamut wideColorGamutForNumber = WideColorGamut.forNumber(this.wideColorGamut_);
            return wideColorGamutForNumber == null ? WideColorGamut.UNRECOGNIZED : wideColorGamutForNumber;
        }

        @Override // com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder
        public int getWideColorGamutValue() {
            return this.wideColorGamut_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getProduct().hashCode() + a.a((((getSdkVersionMinor() + ((((getSdkVersion() + a.a(a.a(a.a(a.a(a.a((((getDensity() + a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a((((getSmallestScreenWidthDp() + ((((getScreenHeightDp() + ((((getScreenWidthDp() + ((((getScreenHeight() + ((((getScreenWidth() + a.a((((getLocale().hashCode() + ((((getMnc() + ((((getMcc() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53, this.layoutDirection_, 37, 5, 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53, this.screenLayoutSize_, 37, 11, 53), this.screenLayoutLong_, 37, 12, 53), this.screenRound_, 37, 13, 53), this.wideColorGamut_, 37, 14, 53), this.hdr_, 37, 15, 53), this.orientation_, 37, 16, 53), this.uiModeType_, 37, 17, 53), this.uiModeNight_, 37, 18, 53)) * 37) + 19) * 53, this.touchscreen_, 37, 20, 53), this.keysHidden_, 37, 21, 53), this.keyboard_, 37, 22, 53), this.navHidden_, 37, 23, 53), this.navigation_, 37, 24, 53)) * 37) + 27) * 53)) * 37) + 26) * 53, this.grammaticalGender_, 37, 25, 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Configuration();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i10 = this.mcc_;
            if (i10 != 0) {
                codedOutputStream.writeUInt32(1, i10);
            }
            int i11 = this.mnc_;
            if (i11 != 0) {
                codedOutputStream.writeUInt32(2, i11);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.locale_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.locale_);
            }
            if (this.layoutDirection_ != LayoutDirection.LAYOUT_DIRECTION_UNSET.getNumber()) {
                codedOutputStream.writeEnum(4, this.layoutDirection_);
            }
            int i12 = this.screenWidth_;
            if (i12 != 0) {
                codedOutputStream.writeUInt32(5, i12);
            }
            int i13 = this.screenHeight_;
            if (i13 != 0) {
                codedOutputStream.writeUInt32(6, i13);
            }
            int i14 = this.screenWidthDp_;
            if (i14 != 0) {
                codedOutputStream.writeUInt32(7, i14);
            }
            int i15 = this.screenHeightDp_;
            if (i15 != 0) {
                codedOutputStream.writeUInt32(8, i15);
            }
            int i16 = this.smallestScreenWidthDp_;
            if (i16 != 0) {
                codedOutputStream.writeUInt32(9, i16);
            }
            if (this.screenLayoutSize_ != ScreenLayoutSize.SCREEN_LAYOUT_SIZE_UNSET.getNumber()) {
                codedOutputStream.writeEnum(10, this.screenLayoutSize_);
            }
            if (this.screenLayoutLong_ != ScreenLayoutLong.SCREEN_LAYOUT_LONG_UNSET.getNumber()) {
                codedOutputStream.writeEnum(11, this.screenLayoutLong_);
            }
            if (this.screenRound_ != ScreenRound.SCREEN_ROUND_UNSET.getNumber()) {
                codedOutputStream.writeEnum(12, this.screenRound_);
            }
            if (this.wideColorGamut_ != WideColorGamut.WIDE_COLOR_GAMUT_UNSET.getNumber()) {
                codedOutputStream.writeEnum(13, this.wideColorGamut_);
            }
            if (this.hdr_ != Hdr.HDR_UNSET.getNumber()) {
                codedOutputStream.writeEnum(14, this.hdr_);
            }
            if (this.orientation_ != Orientation.ORIENTATION_UNSET.getNumber()) {
                codedOutputStream.writeEnum(15, this.orientation_);
            }
            if (this.uiModeType_ != UiModeType.UI_MODE_TYPE_UNSET.getNumber()) {
                codedOutputStream.writeEnum(16, this.uiModeType_);
            }
            if (this.uiModeNight_ != UiModeNight.UI_MODE_NIGHT_UNSET.getNumber()) {
                codedOutputStream.writeEnum(17, this.uiModeNight_);
            }
            int i17 = this.density_;
            if (i17 != 0) {
                codedOutputStream.writeUInt32(18, i17);
            }
            if (this.touchscreen_ != Touchscreen.TOUCHSCREEN_UNSET.getNumber()) {
                codedOutputStream.writeEnum(19, this.touchscreen_);
            }
            if (this.keysHidden_ != KeysHidden.KEYS_HIDDEN_UNSET.getNumber()) {
                codedOutputStream.writeEnum(20, this.keysHidden_);
            }
            if (this.keyboard_ != Keyboard.KEYBOARD_UNSET.getNumber()) {
                codedOutputStream.writeEnum(21, this.keyboard_);
            }
            if (this.navHidden_ != NavHidden.NAV_HIDDEN_UNSET.getNumber()) {
                codedOutputStream.writeEnum(22, this.navHidden_);
            }
            if (this.navigation_ != Navigation.NAVIGATION_UNSET.getNumber()) {
                codedOutputStream.writeEnum(23, this.navigation_);
            }
            int i18 = this.sdkVersion_;
            if (i18 != 0) {
                codedOutputStream.writeUInt32(24, i18);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.product_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 25, this.product_);
            }
            if (this.grammaticalGender_ != GrammaticalGender.GRAM_GENDER_USET.getNumber()) {
                codedOutputStream.writeEnum(26, this.grammaticalGender_);
            }
            int i19 = this.sdkVersionMinor_;
            if (i19 != 0) {
                codedOutputStream.writeUInt32(27, i19);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private Configuration(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mcc_ = 0;
            this.mnc_ = 0;
            this.locale_ = "";
            this.layoutDirection_ = 0;
            this.screenWidth_ = 0;
            this.screenHeight_ = 0;
            this.screenWidthDp_ = 0;
            this.screenHeightDp_ = 0;
            this.smallestScreenWidthDp_ = 0;
            this.screenLayoutSize_ = 0;
            this.screenLayoutLong_ = 0;
            this.screenRound_ = 0;
            this.wideColorGamut_ = 0;
            this.hdr_ = 0;
            this.orientation_ = 0;
            this.uiModeType_ = 0;
            this.uiModeNight_ = 0;
            this.density_ = 0;
            this.touchscreen_ = 0;
            this.keysHidden_ = 0;
            this.keyboard_ = 0;
            this.navHidden_ = 0;
            this.navigation_ = 0;
            this.sdkVersion_ = 0;
            this.sdkVersionMinor_ = 0;
            this.grammaticalGender_ = 0;
            this.product_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Configuration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i10 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i10) : new Builder(i10).mergeFrom(this);
        }

        public static Configuration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static Configuration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Configuration() {
            this.mcc_ = 0;
            this.mnc_ = 0;
            this.locale_ = "";
            this.layoutDirection_ = 0;
            this.screenWidth_ = 0;
            this.screenHeight_ = 0;
            this.screenWidthDp_ = 0;
            this.screenHeightDp_ = 0;
            this.smallestScreenWidthDp_ = 0;
            this.screenLayoutSize_ = 0;
            this.screenLayoutLong_ = 0;
            this.screenRound_ = 0;
            this.wideColorGamut_ = 0;
            this.hdr_ = 0;
            this.orientation_ = 0;
            this.uiModeType_ = 0;
            this.uiModeNight_ = 0;
            this.density_ = 0;
            this.touchscreen_ = 0;
            this.keysHidden_ = 0;
            this.keyboard_ = 0;
            this.navHidden_ = 0;
            this.navigation_ = 0;
            this.sdkVersion_ = 0;
            this.sdkVersionMinor_ = 0;
            this.grammaticalGender_ = 0;
            this.product_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.locale_ = "";
            this.layoutDirection_ = 0;
            this.screenLayoutSize_ = 0;
            this.screenLayoutLong_ = 0;
            this.screenRound_ = 0;
            this.wideColorGamut_ = 0;
            this.hdr_ = 0;
            this.orientation_ = 0;
            this.uiModeType_ = 0;
            this.uiModeNight_ = 0;
            this.touchscreen_ = 0;
            this.keysHidden_ = 0;
            this.keyboard_ = 0;
            this.navHidden_ = 0;
            this.navigation_ = 0;
            this.grammaticalGender_ = 0;
            this.product_ = "";
        }
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        int getDensity();

        Configuration.GrammaticalGender getGrammaticalGender();

        int getGrammaticalGenderValue();

        Configuration.Hdr getHdr();

        int getHdrValue();

        Configuration.Keyboard getKeyboard();

        int getKeyboardValue();

        Configuration.KeysHidden getKeysHidden();

        int getKeysHiddenValue();

        Configuration.LayoutDirection getLayoutDirection();

        int getLayoutDirectionValue();

        String getLocale();

        ByteString getLocaleBytes();

        int getMcc();

        int getMnc();

        Configuration.NavHidden getNavHidden();

        int getNavHiddenValue();

        Configuration.Navigation getNavigation();

        int getNavigationValue();

        Configuration.Orientation getOrientation();

        int getOrientationValue();

        String getProduct();

        ByteString getProductBytes();

        int getScreenHeight();

        int getScreenHeightDp();

        Configuration.ScreenLayoutLong getScreenLayoutLong();

        int getScreenLayoutLongValue();

        Configuration.ScreenLayoutSize getScreenLayoutSize();

        int getScreenLayoutSizeValue();

        Configuration.ScreenRound getScreenRound();

        int getScreenRoundValue();

        int getScreenWidth();

        int getScreenWidthDp();

        int getSdkVersion();

        int getSdkVersionMinor();

        int getSmallestScreenWidthDp();

        Configuration.Touchscreen getTouchscreen();

        int getTouchscreenValue();

        Configuration.UiModeNight getUiModeNight();

        int getUiModeNightValue();

        Configuration.UiModeType getUiModeType();

        int getUiModeTypeValue();

        Configuration.WideColorGamut getWideColorGamut();

        int getWideColorGamutValue();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_aapt_pb_Configuration_descriptor = descriptor2;
        internal_static_aapt_pb_Configuration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Mcc", "Mnc", "Locale", "LayoutDirection", "ScreenWidth", "ScreenHeight", "ScreenWidthDp", "ScreenHeightDp", "SmallestScreenWidthDp", "ScreenLayoutSize", "ScreenLayoutLong", "ScreenRound", "WideColorGamut", "Hdr", "Orientation", "UiModeType", "UiModeNight", "Density", "Touchscreen", "KeysHidden", "Keyboard", "NavHidden", "Navigation", "SdkVersion", "SdkVersionMinor", "GrammaticalGender", "Product"});
    }

    private ConfigurationOuterClass() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
