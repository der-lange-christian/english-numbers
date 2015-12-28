

# english-numbers

just for convenience a translater for english numbers.

Input: 123.456
Output: one hundred twenty three thousand five hundred sixty seven


# Overview

## start program
- java -jar english-numbers.jar

## building targets
- mvn assembly:assembly (jar)
- mvn site (Documentation)

## further documentation
The markdown input files can be found under `src/site/markdown`. The `index.md` contains detailed information on the template. The chapters of the arc42 template are stored in `src/site/markdown/doc`. Images can be linked using the standard markdown syntax and should be stored under `src/site/resources` (see example image at `index.md`). 

The site will be built with `mvn site` and is stored in the `target` directory. 
