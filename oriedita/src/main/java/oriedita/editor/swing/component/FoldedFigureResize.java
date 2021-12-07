package oriedita.editor.swing.component;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import oriedita.editor.databinding.FoldedFigureModel;
import oriedita.editor.databinding.MeasuresModel;
import oriedita.editor.service.ButtonService;

import javax.swing.*;
import java.awt.*;

public class FoldedFigureResize extends JPanel {
    private JButton foldedFigureSizeDecreaseButton;
    private JPanel panel1;
    private JTextField foldedFigureSizeTextField;
    private JButton foldedFigureSizeSetButton;
    private JButton foldedFigureSizeIncreaseButton;

    public FoldedFigureResize(ButtonService buttonService, FoldedFigureModel foldedFigureModel, MeasuresModel measuresModel) {
        add($$$getRootComponent$$$());

        buttonService.registerButton(foldedFigureSizeSetButton, "foldedFigureSizeSetAction");
        buttonService.registerButton(foldedFigureSizeDecreaseButton, "foldedFigureSizeDecreaseAction");
        buttonService.registerButton(foldedFigureSizeIncreaseButton, "foldedFigureSizeIncreaseAction");

        foldedFigureSizeSetButton.addActionListener(e -> foldedFigureModel.setScale(measuresModel.string2double(foldedFigureSizeTextField.getText(), foldedFigureModel.getScale())));
        foldedFigureSizeDecreaseButton.addActionListener(e -> foldedFigureModel.zoomOut());
        foldedFigureSizeIncreaseButton.addActionListener(e -> foldedFigureModel.zoomIn());
        foldedFigureSizeTextField.addActionListener(e -> foldedFigureSizeSetButton.doClick());
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        foldedFigureSizeDecreaseButton = new JButton();
        foldedFigureSizeDecreaseButton.setIcon(new ImageIcon(getClass().getResource("/ppp/oriagari_syukusyou.png")));
        panel1.add(foldedFigureSizeDecreaseButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        foldedFigureSizeTextField = new JTextField();
        foldedFigureSizeTextField.setColumns(2);
        foldedFigureSizeTextField.setHorizontalAlignment(4);
        panel1.add(foldedFigureSizeTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(30, -1), null, null, 0, false));
        foldedFigureSizeSetButton = new JButton();
        foldedFigureSizeSetButton.setText("S");
        panel1.add(foldedFigureSizeSetButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        foldedFigureSizeIncreaseButton = new JButton();
        foldedFigureSizeIncreaseButton.setIcon(new ImageIcon(getClass().getResource("/ppp/oriagari_kakudai.png")));
        panel1.add(foldedFigureSizeIncreaseButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    public String getText() {
        return foldedFigureSizeTextField.getText();
    }

    public void setText(String text) {
        foldedFigureSizeTextField.setText(text);
        foldedFigureSizeTextField.setCaretPosition(0);
    }
}
