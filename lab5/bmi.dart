import 'package:flutter/material.dart';

class BMI extends StatefulWidget {
    @override
    _BMIState createState() => _BMIState();
}

class _BMIState extends State<BMI> {
    final TextEditingController _heightController = TextEditingController();
    final TextEditingController _weightController = TextEditingController();

    double _result;

    @override
    Widget build(BuildContext context) {
        return Scaffold(
            appBar: AppBar(
                title: Text('BMI Calculator'),
                centerTitle: true,
            ),
            body: Container(
                padding: EdgeInsets.symmetric(horizontal: 10.0),
                child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: <Widget>[
                        TextField(
                            controller: _heightController,
                            keyboardType: TextInputType.number,
                            decoration: InputDecoration(
                                labelText: 'height in cm',
                            ),
                        ),
                        SizedBox(height: 50),
                        TextField(
                            controller: _weightController,
                            keyboardType: TextInputType.number,
                            decoration: InputDecoration(
                                labelText: 'weight in kg',
                            ),
                        ),
                        SizedBox(height: 50),
                        OutlineButton(
                            child: Text(
                                "Calculate",
                            ),
                            onPressed: calculateBMI,
                        ),
                        SizedBox(height: 50),
                        TextField(
                                decoration: InputDecoration(
                                        border: InputBorder.none,
                                        hintText: 'Result'
                                ),
                        ),
                        Text(
                            _result == null ? "Enter Value" : "${_result.toStringAsFixed(2)}",
                            style: TextStyle(
                                color: Colors.redAccent,
                                fontSize: 19.4,
                                fontWeight: FontWeight.w500,
                            ),
                        ),
                    ],
                ),
            ),
        );
    }

    void calculateBMI() {
        double height = double.parse(_heightController.text) / 100;
        double weight = double.parse(_weightController.text);

        double heightSquare = height * height;
        double result = weight / heightSquare;
        _result = result;
        setState(() {});
    }
}