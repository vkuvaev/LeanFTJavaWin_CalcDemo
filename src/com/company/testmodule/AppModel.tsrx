<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AppModel</className>
    <objects>
        <object type="Window" technology="Standard Windows">
            <name>Calculator</name>
            <codeName>CalculatorWindow</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="WindowClassRegExp" type="string" isRegExp="false">CalcFrame</property>
                    <property name="WindowTitleRegExp" type="string" isRegExp="false">Calculator</property>
                </properties>
            </identification>
            <children>
                <object type="Button" technology="Standard Windows">
                    <name>Button</name>
                    <codeName>ButtonClear</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">Button</property>
                            <property name="Text" type="string" isRegExp="false"></property>
                            <property name="WindowId" type="int" isRegExp="false">81</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Standard Windows">
                    <name>Button1</name>
                    <codeName>Button1</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">Button</property>
                            <property name="Text" type="string" isRegExp="false"></property>
                            <property name="WindowId" type="int" isRegExp="false">131</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Standard Windows">
                    <name>Button2</name>
                    <codeName>ButtonPlus</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">Button</property>
                            <property name="Text" type="string" isRegExp="false"></property>
                            <property name="WindowId" type="int" isRegExp="false">93</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Standard Windows">
                    <name>Button3</name>
                    <codeName>ButtonEq</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">Button</property>
                            <property name="Text" type="string" isRegExp="false"></property>
                            <property name="WindowId" type="int" isRegExp="false">121</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
